import java.util.PriorityQueue;

public class EventList {
  public PriorityQueue<Event> events = new PriorityQueue<>();
  
  public void addEvent(Event event) {
    events.add(event);
  }

  public void removeFirst() {
    if (!events.isEmpty()) {
      events.poll();
    } else {
      System.out.printf("no event to remove");
    }
  }

  public void printEvents() {
    // System.out.println(events);
    // following also empties queue :DD
    while (!events.isEmpty()) {
      Event e = events.poll();
      System.out.printf(
          "ID: %d, Time: %d, Type: %s\n",
          e.getID(), e.getTime(), e.type
          );
    }
  }
}

