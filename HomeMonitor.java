import java.rmi.*;
import java.rmi.server.*;
 
public class HomeMonitor
    extends UnicastRemoteObject implements RemoteHomeMonitor {

    private static final long serialVersionUID = 2L;

    HomeAlarmSystem alarmSystem;
    HomeLightsSystem lightsSystem;
    HomeTemperatureSystem temperatureSystem; 

    public HomeMonitor(HomeAlarmSystem myAlarmSystem, HomeLightsSystem myLightsSystem, 
                    HomeTemperatureSystem myTemperatureSystem) throws RemoteException{
      alarmSystem = myAlarmSystem;
      lightsSystem = myLightsSystem;
      temperatureSystem = myTemperatureSystem;
    }

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

    public String getState(HomeSystem s) {
      return s.getState().toString();
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