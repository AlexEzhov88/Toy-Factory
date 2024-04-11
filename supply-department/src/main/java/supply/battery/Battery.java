package supply.battery;

/**
 * Абстрактный класс, представляющий батарейку.
 * Определяет основные свойства и методы, общие для всех типов батареек.
 */
public abstract class Battery {
    private final String brand;

    protected Battery(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    /**
     * Показывает напряжение батарейки.
     * Абстрактный метод, который должен быть реализован в наследниках.
     */
    public abstract void showVoltage();
}
