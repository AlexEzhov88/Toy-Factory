package toys.weapons;

import toys.exceptions.BatteryException;
import toys.interfaces.Testable;
import toys.interfaces.Weapon;
import toys.service.AbstractToy;

/**
 * Класс муляжа АК47, наследуется от Toy.
 * Имитирует стрельбу, включает в себя уникальный ID.
 */
public class AK47Mock extends AbstractToy implements Weapon, Testable {

    public AK47Mock() {
        super("AK47_MOCK001");
    }

    /**
     * Конструктор для создания AK47Mock с заданным артикульным номером.
     * @param articleNumber Артикульный номер AK47Mock
     */
    public AK47Mock(String articleNumber) {
        super(articleNumber);
    }

    @Override
    public void play() {
        System.out.println("Муляж АК47 делает выстрел. ID: " + getId());
    }

    @Override
    public void shoot() {
        System.out.println("Муляж АК47 имитирует стрельбу.");
    }

    @Override
    public void blinkLight() {
        System.out.println("Муляж АК47 мигает красным светом.");
    }

    @Override
    public void test() throws BatteryException {
        System.out.println("Тестирование муляжа АК47.");
        play();
        shoot();
        blinkLight();
        checkBattery(); // Добавлен вызов метода проверки батареи
    }

    @Override
    public void checkBattery() throws BatteryException {
        System.out.println("Проверка батареи: батарея в хорошем состоянии.");
    }
}