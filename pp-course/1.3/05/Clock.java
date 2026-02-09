public class Clock {

  // amazed at how a single global variable
  // becomes an object with 4 methods
  // and 1 meaningful attribute :DD

  private static Clock instance;

  private Clock() {
  }

  public static Clock getInstance() {
    if (instance == null) {
      instance = new Clock();
    }
    return instance;
  }

  // :DDDDDDDDDDDD
  private double time = 0;

  public void setTime(double time) {
    this.time = time;
  }
  public void addTime(double time) {
    this.time += time;
  }
  public double getTime() {
    return time;
  }
}
