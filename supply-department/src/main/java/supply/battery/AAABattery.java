package supply.battery;

/**
 * Класс батарейки типа AAA.
 */
public class AAABattery extends Battery {
    public AAABattery(String brand) {
        super(brand);
    }

    @Override
    public void showVoltage() {
        System.out.println("Напряжение батарейки AAA: 1.5V");
    }
}
