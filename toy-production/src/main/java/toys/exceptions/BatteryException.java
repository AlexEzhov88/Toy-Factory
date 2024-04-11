package toys.exceptions;

/**
 * Исключение, выбрасываемое когда возникают проблемы с батареей игрушки.
 * Это может быть вызвано, например, низким уровнем заряда или неисправностью батареи.
 */
public class BatteryException extends Exception {
    /**
     * Конструктор исключения с сообщением о проблеме.
     * @param message описание проблемы с батареей.
     */
    public BatteryException(String message) {
        super(message);
    }
}
