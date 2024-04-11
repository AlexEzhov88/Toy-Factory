package toys.radiocontrolled;

import toys.exceptions.BatteryException;
import toys.exceptions.SignalException;
import toys.service.AbstractToy;

public abstract class RadioControlledToy extends AbstractToy {
    private boolean isRemoteControlEnabled;

    protected RadioControlledToy(String articleNumber) {
        super(articleNumber);
    }

    public void setRemoteControlEnabled(boolean isRemoteControlEnabled) {
        this.isRemoteControlEnabled = isRemoteControlEnabled;
    }

    public boolean isRemoteControlEnabled() {
        return isRemoteControlEnabled;
    }

    public abstract void move();

    public abstract void checkBattery() throws BatteryException;

    // Абстрактный метод для проверки сигнала
    public abstract void checkSignal() throws SignalException;
}

