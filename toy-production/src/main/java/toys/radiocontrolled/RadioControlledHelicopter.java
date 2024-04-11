package toys.radiocontrolled;

import supply.SupplyManager;
import supply.battery.Battery;
import supply.component.Chip;
import toys.exceptions.BatteryException;
import toys.exceptions.SignalException;
import toys.interfaces.Lightable;
import toys.service.AbstractToy;

/**
 * Класс радиоуправляемого вертолета, реализующий интерфейс Lightable для мигания светом.
 * Поддерживает проверку состояния батареи и сигнала управления.
 */
public class RadioControlledHelicopter extends AbstractToy implements Lightable, RadioControlled {
    private boolean radioControlOn = false;
    private final RemoteBattery remoteBattery = new RemoteBattery();
    private final SupplyManager supplyManager;

    private Chip chip;
    private Battery battery;

    public RadioControlledHelicopter(String articleNumber, SupplyManager supplyManager) {
        super(articleNumber);
        this.supplyManager = supplyManager;
        initializeComponents();
    }

    private void initializeComponents() {
        // Получаем чип и батарейку отдела снабжения
        chip = (Chip) supplyManager.getComponent("Chip");
        battery = supplyManager.getBattery("AA");
    }

    @Override
    public void play() {
        try {
            checkBattery();
            checkSignal();
            move();
            blinkLight(); // Первый вызов
            checkRotor();
        } catch (BatteryException | SignalException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void setRadioControl(boolean on) {
        radioControlOn = on;
        System.out.println("Радиоуправление " + (on ? "включено" : "выключено") + ". Артикул: " + getArticleNumber());
    }

    @Override
    public void blinkLight() {
        System.out.println("Вертолет мигает светом. Артикул: " + getArticleNumber());
    }

    public void move() {
        System.out.println("Радиоуправляемый вертолет летит. Артикул: " + getArticleNumber());
    }

    @Override
    public void checkBattery() throws BatteryException {
        if (!remoteBattery.isChargeSufficient()) {
            throw new BatteryException("Батарея пульта разряжена. Артикул: " + getArticleNumber());
        }
    }

    @Override
    public void checkSignal() throws SignalException {
        if (Math.random() > 0.5) {
            throw new SignalException("Проблема с сигналом управления вертолетом. Артикул: " + getArticleNumber());
        }
    }

    public void checkRotor() throws SignalException {
        double chance = Math.random();
        if (chance < 0.25) {
            throw new SignalException("Лопасти заблокированы. Артикул: " + getArticleNumber());
        } else if (chance < 0.50) {
            throw new SignalException("Ротор заблокирован. Артикул: " + getArticleNumber());
        } else if (chance < 0.75) {
            throw new SignalException("Поврежден двигатель. Артикул: " + getArticleNumber());
        } else {
            System.out.println("Лопасти успешно двигаются. Артикул: " + getArticleNumber());
        }
    }

    /**
     * Метод для замены батарейки в пульте управления.
     */
    public void replaceBattery() {
        Battery newBattery = supplyManager.replaceBattery("AA");
        System.out.println("Заменяем батарейку в пультe управления. Новая батарейка: " + newBattery.getBrand());
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
}
