package BehavioralDesignPatterns.Observer.Alarm;

import java.util.Enumeration;
import java.util.Vector;

class SensorSystem {

    private Vector<AlarmListener> listeners = new Vector<>();

    void register(AlarmListener alarmListener) {
        listeners.addElement(alarmListener);
    }

    void soundTheAlarm() {

        for (Enumeration<AlarmListener> e = listeners.elements(); e.hasMoreElements(); ) {
            (e.nextElement()).alarm();
        }
    }
}
