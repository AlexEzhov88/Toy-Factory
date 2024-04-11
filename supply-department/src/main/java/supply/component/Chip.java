package supply.component;

/**
 * Класс, представляющий чип.
 * Чипы являются важными компонентами для радиоуправляемых игрушек.
 */
public class Chip extends Component {

    public Chip() {
        super();
    }

    /**
     * Демонстрирует функцию чипа.
     * Может быть расширен для реализации специфической функциональности.
     */
    public void performFunction() {
        System.out.println("Чип с ID " + getId() + " выполняет свою функцию.");
    }
}
