package toys.weapons;

import toys.exceptions.BatteryException;
import toys.interfaces.Weapon;
import toys.service.AbstractToy;

/**
 * Класс муляжа М16.
 * Реализует интерфейс Weapon.
 */
public class M16Mock extends AbstractToy implements Weapon {

    public M16Mock() {
        super("M16_MOCK001");
    }

    /**
     * Конструктор для создания муляжа М16 с заданным артикульным номером.
     * @param articleNumber Артикульный номер муляжа М16.
     */
    public M16Mock(String articleNumber) {
        super(articleNumber);
    }

    @Override
    public void checkBattery() throws BatteryException {
        System.out.println("Проверка батареи: батарея в хорошем состоянии.");
    }

    @Override
    public void play() {
        System.out.println("Муляж М16 делает выстрел. ID: " + getId());
    }

    @Override
    public void shoot() {
        System.out.println("Звук М16: Тра-та-та!");
    }

    @Override
    public void blinkLight() {
        System.out.println("Муляж М16 моргает белым светом.");
    }
}
