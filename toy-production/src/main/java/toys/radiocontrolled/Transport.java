package toys.radiocontrolled;


import toys.service.AbstractToy;

/**
 * Абстрактный класс для радиоуправляемых транспортных средств.
 */
public abstract class Transport extends AbstractToy {
    /**
     * Конструктор для создания объекта транспортного средства с указанным артикульным номером.
     *
     * @param articleNumber Артикульный номер транспортного средства.
     */
    protected Transport(String articleNumber) {
        super(articleNumber);
    }

    /**
     * Общий метод перемещения для всех транспортных средств.
     * Реализация может варьироваться в зависимости от типа транспорта (ехать, лететь, плыть).
     */
    public abstract void move();
}
