package qa;

import toys.interfaces.Lightable;
import toys.radiocontrolled.RadioControlledHelicopter;
import toys.radiocontrolled.RadioControlledToy;
import toys.service.Toy;

import java.util.List;

/**
 * Отдел контроля качества, отвечающий за тестирование игрушек.
 */
public class QADepartment {
    /**
     * Выполняет комплексную проверку списка игрушек.
     * @param toys Список игрушек для проверки.
     */
    public void performComplexChecks(List<Toy> toys) {
        for (Toy toy : toys) {
            System.out.println("\nНачало проверки игрушки с артикулом: " + toy.getArticleNumber());
            try {
                // Проведение общей игры с игрушкой
                toy.play();

                // Отдельная проверка мигания светом только для тех игрушек, которые поддерживают эту функцию
                if (toy instanceof Lightable lightableToy) {
                    lightableToy.blinkLight();
                    System.out.println("Проверка мигания светом пройдена успешно.");
                }

                // Отдельная проверка радиоуправляемых игрушек
                if (toy instanceof RadioControlledToy rcToy) {
                    rcToy.checkBattery();
                    rcToy.checkSignal();
                    System.out.println("Радиоуправляемая игрушка проверена успешно.");
                }
                if (toy instanceof RadioControlledHelicopter helicopter) {
                    helicopter.checkRotor();
                    System.out.println("Проверка ротора вертолёта успешно пройдена.");
                }

            } catch (Exception e) {
                System.out.println("Произошла ошибка при проверке игрушки: " + e.getMessage());
            }
        }
    }

}
