package toys.weapons;

import toys.exceptions.BatteryException;
import toys.interfaces.Weapon;
import toys.service.AbstractToy;

/**
 * Класс водного пистолета.
 * Реализует интерфейс Weapon.
 */
public class WaterPistol extends AbstractToy implements Weapon {
    public WaterPistol() {
        super("Water_Pistol001");
    }

    /**
     * Конструктор для создания водного пистолета с заданным артикульным номером.
     * @param articleNumber Артикульный номер водного пистолета.
     */
    public WaterPistol(String articleNumber) {
        super(articleNumber);
    }

    @Override
    public void checkBattery() throws BatteryException {
        System.out.println("Проверка батареи: батарейки не предусмотрено ");
    }


    @Override
    public void play() {
        System.out.println("Водный пистолет стреляет. ID: " + getId());
    }

    @Override
    public void blinkLight() {
        // Водный пистолет не мигает светом
    }

    @Override
    public void shoot() {
        System.out.println("Водный пистолет стреляет водой.");
    }
}
