public class HomeTemperatureSystem extends System {

  State dayMode;
  State nightMode;
  State awayMode;

  public void turnOff() {
    System.out.println("Home Temperature Control System is Off.");
  }
  public void turnOn() {
    System.out.println("Home Temperature Control System is On.");
  }
}