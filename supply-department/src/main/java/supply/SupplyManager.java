package supply;

import supply.battery.AAABattery;
import supply.battery.AABattery;
import supply.battery.Battery;
import supply.battery.BatteryBrand;
import supply.battery.CronaBattery;
import supply.component.Chip;
import supply.component.Component;
import supply.component.RadioModule;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс управляет комплектующими отдела снабжения, включая батарейки и электронные компоненты.
 * Обеспечивает доступ к компонентам и батарейкам для других модулей приложения.
 */
public class SupplyManager {
    private final Map<String, Component> components;
    private final Map<String, Battery> batteries;

    public SupplyManager() {
        components = new HashMap<>();
        batteries = new HashMap<>();
        initializeComponents();
        initializeBatteries();
    }

    /**
     * Инициализирует компоненты, доступные в отделе снабжения.
     */
    private void initializeComponents() {
        components.put("Chip", new Chip());
        components.put("RadioModule", new RadioModule());
    }

    /**
     * Инициализирует батарейки разных типов, доступные в отделе снабжения.
     */
    private void initializeBatteries() {
        // Инициализация с примерным равным распределением брендов для каждого типа
        for (BatteryBrand brand : BatteryBrand.values()) {
            batteries.put("AAA-" + brand, new AAABattery(brand.toString()));
            batteries.put("AA-" + brand, new AABattery(brand.toString()));
            batteries.put("Crona-" + brand, new CronaBattery(brand.toString()));
        }
    }

    /**
     * Возвращает компонент по его типу.
     *
     * @param type Тип компонента.
     * @return Компонент указанного типа.
     * @throws IllegalArgumentException если компонент заданного типа не найден.
     */
    public Component getComponent(String type) {
        if (!components.containsKey(type)) {
            throw new IllegalArgumentException("Компонент не найден: " + type);
        }
        return components.get(type);
    }

    /**
     * Возвращает батарейку заданного типа со случайным выбором бренда.
     *
     * @param type Тип батарейки.
     * @return Батарейка указанного типа и случайного бренда.
     * @throws IllegalArgumentException если указан неизвестный тип батарейки.
     */
    public Battery getBattery(String type) {
        BatteryBrand brand = BatteryBrand.getRandomBrand();
        String key = type + "-" + brand;
        if (!batteries.containsKey(key)) {
            throw new IllegalArgumentException("Батарейка заданного типа не доступна: " + type);
        }
        return batteries.get(key);
    }

    /**
     * Заменяет батарейку на новую заданного типа и случайного бренда.
     * Эмулирует процесс получения новой батарейки из запасов отдела снабжения.
     *
     * @param type Тип батарейки для замены.
     * @return Новая батарейка заданного типа и случайного бренда.
     * @throws IllegalArgumentException если не удалось найти батарейку заданного типа.
     */
    public Battery replaceBattery(String type) {
        return getBattery(type); // Использует метод getBattery для получения новой батарейки
    }
}
