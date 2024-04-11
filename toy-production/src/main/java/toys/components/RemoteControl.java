package toys.components;

import toys.exceptions.BatteryException;
import toys.exceptions.SignalException;

/**
 * Класс пульта дистанционного управления для радиоуправляемых игрушек.
 * Позволяет симулировать проверку батареи, отправку запросов, вибрацию и взаимодействие с антенной.
 */
public class RemoteControl {
    private boolean isBatteryOk = true;
    private final Antenna antenna;

    public RemoteControl(Antenna antenna) {
        this.antenna = antenna;
    }

    /**
     * Заменяет батарею в пульте, восстанавливая его работоспособность.
     */
    public void replaceBattery() {
        isBatteryOk = true;
        System.out.println("Батарейка в пульте заменена.");
    }

    /**
     * Проверяет состояние батареи в пульте.
     *
     * @throws BatteryException если батарея дефектная.
     */
    public void checkBattery() throws BatteryException {
        if (!isBatteryOk) {
            throw new BatteryException("Батарейка в пульте дефектная.");
        }
    }

    /**
     * Симулирует отправку широкополосного запроса пультом.
     */
    public void sendBroadbandRequest() {
        System.out.println("Пульт отправляет широкополосный запрос.");
    }

    /**
     * Симулирует вибрацию пульта.
     */
    public void vibrate() {
        System.out.println("Пульт вибрирует.");
    }

    /**
     * Проверяет антенну, идущую в комплекте с радиоуправляемой игрушкой.
     * В случае неисправности батареи или антенны производит соответствующие действия.
     */
    public void checkAntenna() {
        try {
            checkBattery();
            sendBroadbandRequest();
            try {
                antenna.checkSerialNumber();
            } catch (SignalException e) {
                sendBroadbandRequest(); // Повторная отправка запроса в случае неисправности
                System.out.println(e.getMessage());
            }
        } catch (BatteryException e) {
            System.out.println(e.getMessage());
        } finally {
            vibrate(); // Вибрация пульта после проверки
        }
    }
}
