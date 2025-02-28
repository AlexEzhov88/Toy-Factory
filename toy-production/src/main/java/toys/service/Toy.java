package toys.service;

/**
 * Интерфейс для всех игрушек.
 * Определяет базовые методы, общие для всех игрушек.
 */
public interface Toy {
    /**
     * Взаимодействует с игрушкой, активируя её основные функции.
     */
    void play();

    /**
     * Получает артикульный номер игрушки.
     *
     * @return Артикульный номер игрушки.
     */
    String getArticleNumber();

}
