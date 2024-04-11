package toys.radiocontrolled;

import supply.SupplyManager;
import supply.battery.Battery;
import toys.components.Antenna;
import toys.components.RemoteControl;
import toys.exceptions.BatteryException;
import toys.exceptions.SignalException;
import toys.interfaces.Lightable;
import toys.service.AbstractToy;

/**
 * Класс радиоуправляемой машины, реализующий интерфейс Lightable для мигания светом.
 * Использует внутренний класс RemoteBattery для управления состоянием заряда батареи пульта управления.
 */
public class RadioControlledCar extends AbstractToy implements Lightable, RadioControlled {

    private final Antenna antenna = new Antenna();
    private final RemoteControl remoteControl = new RemoteControl(antenna);
    private final SupplyManager supplyManager;

    public RadioControlledCar(String articleNumber, SupplyManager supplyManager) {
        super(articleNumber);
        this.supplyManager = supplyManager;
    }

    @Override
    public void play() {
        try {
            checkBattery();
            checkSignal();
            move();
            blinkLight();
        } catch (BatteryException | SignalException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    @Override
    public void blinkLight() {
        System.out.println("Машинка моргает фарами. Артикул: " + getArticleNumber());
        antenna.blinkLight();
    }

    public void soundEngine() {
        System.out.println("Машинка издает звук двигателя. Артикул: " + getArticleNumber());
    }

    private final RemoteBattery remoteBattery = new RemoteBattery();

    public void move() {
        System.out.println("Машина поехала. Артикул: " + getArticleNumber());
    }

    @Override
    public void checkBattery() throws BatteryException {
        if (!remoteBattery.isChargeSufficient()) {
            throw new BatteryException("Батарея пульта разряжена. Артикул: " + getArticleNumber());
        } else {
            remoteBattery.drainBattery(); // Симуляция разряда батареи
        }
    }

    @Override
    public void setRadioControl(boolean on) {
        System.out.println("Радиоуправление " + (on ? "включено" : "выключено") + ". Артикул: " + getArticleNumber());
    }

    @Override
    public void checkSignal() throws SignalException {
        if (Math.random() > 0.5) {
            throw new SignalException("Проблема с сигналом у радиоуправляемой машины. Артикул: " + getArticleNumber());
        }
    }

    /**
     * Внутренний класс для управления зарядом батареи пульта дистанционного управления.
     */
    private static class RemoteBattery {
        private int chargeLevel = 100;

        public void drainBattery() {
            chargeLevel = Math.max(chargeLevel - 10, 0);
            System.out.println("Уровень заряда батареи пульта уменьшен. Текущий заряд: " + chargeLevel + "%");
        }

        public boolean isChargeSufficient() {
            return chargeLevel > 0;
        }
    }

    /**
     * Метод для замены батарейки в пульте управления.
     */
    public void replaceBattery() {
        Battery newBattery = supplyManager.replaceBattery("AA");
        System.out.println("Заменяем батарейку в пультe управления. Новая батарейка: " + newBattery.getBrand());
    }

}
