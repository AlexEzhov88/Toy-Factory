package toys.exceptions;

/**
 * Исключение, выбрасываемое при возникновении проблем с сигналом радиоуправляемой игрушки.
 * Это может включать в себя потерю связи, помехи или неисправность оборудования.
 */
public class SignalException extends Exception {
    /**
     * Конструктор исключения с сообщением о проблеме.
     * @param message описание проблемы с сигналом.
     */
    public SignalException(String message) {
        super(message);
    }
}
