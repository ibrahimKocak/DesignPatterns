package BehavioralDesignPatterns.Observer.Alarm;

import TestDesignPatern.Test;

public class zzTestObserverAlarm extends Test {

    @Override
    public void start() {
        super.start();

        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveilleance());
        sensorSystem.soundTheAlarm();
    }
}
