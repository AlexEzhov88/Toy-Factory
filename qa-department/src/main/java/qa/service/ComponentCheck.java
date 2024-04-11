package qa.service;

@FunctionalInterface
public
interface ComponentCheck {
    /**
     * Выполняет проверку компонента.
     *
     * @throws Exception если во время проверки происходит ошибка.
     */
    void check() throws Exception;
}
