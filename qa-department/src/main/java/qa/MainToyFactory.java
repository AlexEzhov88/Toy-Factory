package qa;

import supply.SupplyManager;
import toys.radiocontrolled.RadioControlledCar;
import toys.radiocontrolled.RadioControlledHelicopter;
import toys.soft.Bear;
import toys.soft.Cow;
import toys.weapons.AK47Mock;
import toys.weapons.M16Mock;
import toys.weapons.WaterPistol;

import java.util.Arrays;

/**
 * Главный класс для демонстрации работы фабрики игрушек.
 * Создает игрушки, отдел снабжения и отдел контроля качества для тестирования игрушек.
 */
public class MainToyFactory {

    public static void main(String[] args) {
        SupplyManager supplyManager = new SupplyManager();
        QADepartment qaDepartment = new QADepartment();

        Bear bear = new Bear();
        Cow cow = new Cow();
        RadioControlledCar rcCar = new RadioControlledCar("RC_CAR_001", supplyManager);
        RadioControlledHelicopter rcHelicopter = new RadioControlledHelicopter("RC_HELICOPTER_001", supplyManager);
        WaterPistol waterPistol = new WaterPistol("WATER_PISTOL_001");
        AK47Mock ak47Mock = new AK47Mock("AK47_MOCK_001");
        M16Mock m16Mock = new M16Mock("M16_MOCK_001");

        qaDepartment.performComplexChecks(Arrays.asList(bear, cow, rcCar, rcHelicopter, waterPistol, ak47Mock, m16Mock));
    }
}
