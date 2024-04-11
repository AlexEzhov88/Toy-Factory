package qa.service;

@FunctionalInterface
public
interface SignalCheck {
    /**
     * Проверяет сигнал устройства.
     *
     * @return true, если сигнал в порядке, иначе false.
     * @throws Exception если во время проверки происходит ошибка.
     */
    boolean checkSignal() throws Exception;
}
