package supply.battery;

/**
 * Перечисление доступных брендов батареек.
 */
public enum BatteryBrand {
    ENERGIZER, DURACELL, VARTA, GP;

    /**
     * Получить случайный бренд батарейки.
     *
     * @return Случайно выбранный бренд из доступных значений.
     */
    public static BatteryBrand getRandomBrand() {
        BatteryBrand[] brands = values();
        int index = (int) (Math.random() * brands.length);
        return brands[index];
    }
}
