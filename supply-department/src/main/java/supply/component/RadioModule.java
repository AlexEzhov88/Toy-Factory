package supply.component;

/**
 * Класс, представляющий радио-модуль.
 * Радио-модули используются для обеспечения связи между игрушкой и пультом управления.
 */
public class RadioModule extends Component {

    public RadioModule() {
        super();
    }

    /**
     * Демонстрирует работу радио-модуля.
     * Может быть расширен для реализации специфической функциональности передачи сигнала.
     */
    public void transmitSignal() {
        System.out.println("Радио-модуль с ID " + getId() + " передает сигнал.");
    }
}
