public abstract class System {
  State state;
  Mode mode;

  public abstract void turnOff() {}
  public abstract void turnOn() {}
  public State getState() { return state; }
  public void setState(State s) { state = s; }
  public Mode getMode() { return mode; }
  public void setMode(Mode m) { mode = m; }
}