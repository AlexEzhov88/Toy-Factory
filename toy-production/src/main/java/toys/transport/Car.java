package toys.transport;

import toys.exceptions.BatteryException;
import toys.radiocontrolled.Transport;

/**
 * Класс обычной машинки, умеющей моргать светом и издавать звук клаксона.
 */
public class Car extends Transport {
    private final String articleNumber;

    public Car(String articleNumber) {
        super(articleNumber);
        this.articleNumber = articleNumber;
    }

    @Override
    public void checkBattery() throws BatteryException {
        System.out.println("Батарея нормальная ");

    }

    @Override
    public void move() {
        System.out.println("Машина поехала");

    }

    /**
     * Моргает фарами.
     */
    public void blinkLight() {
        System.out.println("Машинка моргает фарами. Артикул: " + articleNumber);
    }

    /**
     * Издает звук клаксона.
     */
    public void soundHorn() {
        System.out.println("Машинка издает звук клаксона. Артикул: " + articleNumber);
    }

    @Override
    public void play() {
        soundHorn();
        blinkLight();
        System.out.println("Играем с машиной ");
    }
}
