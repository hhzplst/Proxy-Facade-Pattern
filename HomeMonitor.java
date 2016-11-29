import java.rmi.*;
import java.rmi.server.*;
 
public class HomeMonitor
    extends UnicastRemoteObject implements RemoteHomeMonitor {

    private static final long serialVersionUID = 2L;

    HomeAlarmSystem alarmSystem = new HomeAlarmSystem();
    HomeLightsSystem lightsSystem = new HomeLightsSystem();
    HomeTemperatureSystem temperatureSystem = new HomeTemperatureSystem(); 

    public HomeMonitor() throws RemoteException {}

    //Facade Pattern
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

    public String getAlarmSystemState() {
      return alarmSystem.getState().toString();
    }

    public String getLightsSystemState() {
      return lightsSystem.getState().toString();
    }

    public String getTemperatureSystemState() {
      return temperatureSystem.getState().toString();
    }

    public void dayModeAll() {
      //assuming day mode is ready mode for alarm system
      alarmSystem.setReadyMode();
      lightsSystem.setDayMode();
      temperatureSystem.setDayMode();
    }

    public void nightModeAll() {
      alarmSystem.setSleepMode();
      lightsSystem.setSleepMode();
      temperatureSystem.setNightMode();
    }

    public void awayModeAll() {
      alarmSystem.setAwayMode();
      lightsSystem.setAwayMode();
      temperatureSystem.setAwayMode();
    }

}