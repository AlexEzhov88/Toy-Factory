package toys.radiocontrolled;

import toys.exceptions.SignalException;

/**
 * Интерфейс для радиоуправляемых игрушек.
 * Определяет методы, специфичные для управления и контроля радиоуправляемых игрушек.
 */
public interface RadioControlled {
    /**
     * Включает или выключает радиоуправление.
     *
     * @param on true для включения управления, false для выключения.
     */
    void setRadioControl(boolean on);

    /**
     * Проверяет сигнал управления.
     *
     * @throws SignalException если в процессе проверки возникают ошибки.
     */
    void checkSignal() throws SignalException;
}