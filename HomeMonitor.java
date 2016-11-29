import java.rmi.*;
import java.rmi.server.*;
 
public class HomeMonitor
    extends UnicastRemoteObject implements RemoteHomeMonitor {

    private static final long serialVersionUID = 2L;

    HomeAlarmSystem alarmSystem;
    HomeLightsSystem lightsSystem;
    HomeTemperatureSystem temperatureSystem; 

    public void turnOffAll() {
      alarmSystem.turnOff();
      lightsSystem.turnOff();
      temperatureSystem.turnOff();
    }

    public void turnOnAll() {
      alarmSystem.turnOn();
      lightsSystem.turnOn();
      temperatureSystem.turnOn();
    }

    public String getState(System s) {
      return s.getState().toString();
    }

    //TODO: implement modes
    public void dayModeAll() {

    }

    public void nightModeAll() {

    }

    public void awayModeAll() {

    }

}