public class HomeAlarmSystem extends System {

  public void turnOff() {
    state = new HomeAlarmOffState();
    System.out.println("Home Alarm System is Off.");
  }

  public void turnOn() {
    System.out.println("Home Alarm System is On.");
  }

  public void setReadyMode() {
    state = new HomeAlarmReadyMode();
  }

  public void setSleepMode() {
    state = new HomeAlarmSleepMode();
  }

  public void setAwayMode() {
    state = new HomeAlarmAwayMode();
  }
}