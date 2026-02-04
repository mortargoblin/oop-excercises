// import java.util.Comparible;

public class Event implements Comparable<Event>{
  private int time;
  private int id;
  public static int eventCount = 0;
  EventType type;

  public Event(int time, EventType type) {
    this.time = time;
    eventCount++;
    id = eventCount;
    this.type = type;
  }

  public enum EventType {
    ARRIVAL,
    EXIT
  }

  public int compareTo(Event event) {
    /*
    if (event.time == this.time) {
      return 0;
    } else if (event.time > this.time) {
      return 1;
    } else {
      return -1;
    }
    */
    // simple difference instead
    return this.time - event.time;
  }

  public int getTime() {
    return time;
  }

  public int getID() {
    return id;
  }
}
