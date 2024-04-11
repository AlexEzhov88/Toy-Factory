package toys.service;

import toys.exceptions.BatteryException;

import java.util.UUID;

/**
 * Абстрактный класс для всех игрушек.
 * Реализует интерфейс Toy, предоставляя общую реализацию для артикульного номера.
 * Дополнительно вводит уникальный идентификатор для каждой игрушки.
 */
public abstract class AbstractToy implements Toy {
    private final String id = UUID.randomUUID().toString();
    protected String articleNumber;

    /**
     * Конструктор для создания игрушки с указанным артикульным номером.
     *
     * @param articleNumber Артикульный номер игрушки.
     */
    protected AbstractToy(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    /**
     * Возвращает уникальный идентификатор игрушки.
     *
     * @return Уникальный идентификатор в виде строки.
     */
    public String getId() {
        return id;
    }

    /**
     * Возвращает артикульный номер игрушки.
     *
     * @return Артикульный номер игрушки.
     */
    @Override
    public String getArticleNumber() {
        return articleNumber;
    }

    public abstract void checkBattery() throws BatteryException;
}
