package supply.battery;

/**
 * Класс для батарейки типа Crona.
 * Батарейки типа Crona отличаются высоким напряжением и используются в специализированных устройствах.
 */
public class CronaBattery extends Battery {
    public CronaBattery(String brand) {
        super(brand);
    }

    @Override
    public void showVoltage() {
        System.out.println("Напряжение батарейки Crona: 3.7V");
    }
}
