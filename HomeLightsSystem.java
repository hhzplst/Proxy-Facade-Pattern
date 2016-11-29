public class HomeLightsSystem extends System {

  State homeLightsManualMode;
  State homeLightsNightMode;
  State homeLightsDayMode;
  State homeLightsAwayMode;
  State homeLightsOffState;

  public void turnOff() {
    state = new HomeLightsOffState();
    System.out.println("Home Lights System is Off.");
  }
  public void turnOn() {
    System.out.println("Home Lights System is On.");
  }
}