public class HomeTemperatureSystem extends System {

  public void turnOff() {
    state = new HomeTemperatureOffState();
    System.out.println("Home Temperature Control System is Off.");
  }

  public void turnOn() {
    System.out.println("Home Temperature Control System is On.");
  }

  public void setDayMode() {
    state = new HomeTemperatureDayMode();
  }

  public void setNightMode() {
    state = new HomeTemperatureNightMode();
  }

  public void setAwayMode() {
    state = new HomeTemperatureAwayMode();
  }
}