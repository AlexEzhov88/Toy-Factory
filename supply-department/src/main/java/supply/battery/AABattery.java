package supply.battery;

/**
 * Класс батарейки типа AA.
 */
public class AABattery extends Battery {
    public AABattery(String brand) {
        super(brand);
    }

    @Override
    public void showVoltage() {
        System.out.println("Напряжение батарейки AA: 1.5V");
    }
}
