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

    //TODO: implement getState in each system
    public State getState(System s) {
      return s.getState();
    }

    public void dayModeAll() {

    }

    public void nightModeAll() {

    }

    public void awayModeAll() {
      
    }

}