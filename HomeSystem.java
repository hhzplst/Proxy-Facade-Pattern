public abstract class HomeSystem {

  State state;

  public abstract void turnOff();
  public abstract void turnOn();
  public State getState() { return state; }

}