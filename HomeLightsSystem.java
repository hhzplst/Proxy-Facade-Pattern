public class HomeLightsSystem extends HomeSystem {

  public void turnOff() {
    state = new HomeLightsOffState();
    System.out.println("Home Lights System is Off.");
  }

  public void turnOn() {
    System.out.println("Home Lights System is On.");
  }

  public void setManualMode() {
    state = new HomeLightsManualMode();
  }

  public void setSleepMode() {
    state = new HomeLightsSleepMode();
  }

  public void setDayMode() {
    state = new HomeLightsDayMode();
  }

  public void setAwayMode() {
    state = new HomeLightsAwayMode();
  }
  
}