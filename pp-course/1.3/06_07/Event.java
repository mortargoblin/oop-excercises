public class Event {

  private EventType type;
  private double time;

  public Event(EventType type, double time) {
    this.type = type;
    this.time= time;
  }

  public EventType getType() {
    return type;
  }
  public double getTime() {
    return time;
  }
}
