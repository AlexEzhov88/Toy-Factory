package supply.component;

/**
 * Абстрактный класс, представляющий компонент.
 * Содержит общие свойства и методы для всех компонентов.
 */
public abstract class Component {
    private final String id;

    protected Component() {
        this.id = generateId();
    }

    /**
     * Генерирует уникальный идентификатор для компонента.
     *
     * @return Строковое представление UUID.
     */
    private String generateId() {
        return java.util.UUID.randomUUID().toString();
    }

    /**
     * Получает идентификатор компонента.
     *
     * @return Идентификатор компонента.
     */
    public String getId() {
        return id;
    }
}
