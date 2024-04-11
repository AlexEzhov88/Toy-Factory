package toys.soft;

import toys.service.Toy;

/**
 * Абстрактный класс для мягких игрушек.
 * Реализует интерфейс Toy и добавляет специфическую для мягких игрушек функциональность.
 */
public abstract class SoftToy implements Toy {
    protected String articleNumber;
    protected String fillerType;

    protected SoftToy(String articleNumber, String fillerType) {
        this.articleNumber = articleNumber;
        this.fillerType = fillerType;
    }

    public String getFillerType() {
        return fillerType;
    }

    @Override
    public String getArticleNumber() {
        return articleNumber;
    }
}
