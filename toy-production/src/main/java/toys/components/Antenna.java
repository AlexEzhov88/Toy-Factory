package toys.components;

import toys.exceptions.SignalException;

/**
 * Класс, представляющий антенну радиоуправляемой игрушки.
 * Каждая антенна имеет уникальный серийный номер и может мигать светом.
 */
public class Antenna {
    // Уникальный серийный номер антенны
    private final String serialNumber;

    /**
     * Конструктор для создания антенны с уникальным серийным номером.
     */
    public Antenna() {
        // Генерация уникального серийного номера для каждой антенны
        this.serialNumber = java.util.UUID.randomUUID().toString();
    }

    /**
     * Возвращает серийный номер антенны.
     *
     * @return Строковое представление серийного номера антенны.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Симулирует мигание светом антенны.
     * Выводит сообщение в консоль о мигании светом.
     */
    public void blinkLight() {
        System.out.println("Антенна мигает светом. Серийный номер: " + serialNumber);
    }

    /**
     * Проверяет серийный номер антенны на возможные неисправности.
     * В зависимости от случайного события может выбросить исключение {@link SignalException}.
     *
     * @throws SignalException если серийный номер не найден или дефектный.
     */
    public void checkSerialNumber() throws SignalException {
        double chance = Math.random();
        if (chance < 0.33) {
            throw new SignalException("Серийный номер не найден.");
        } else if (chance < 0.66) {
            throw new SignalException("Серийный номер дефектный.");
        }
        // Если серийный номер в порядке, выводим сообщение об этом
        System.out.println("Серийный номер антенны в порядке. Номер: " + serialNumber);
    }
}
