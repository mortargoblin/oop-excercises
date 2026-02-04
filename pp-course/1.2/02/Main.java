public class Main {
  // never any use for args :((
  public static void main(String[] args) {

    Event[] events = {
      new Event(1, Event.EventType.ARRIVAL),
      new Event(2, Event.EventType.ARRIVAL),
      new Event(4, Event.EventType.EXIT),
      new Event(6, Event.EventType.EXIT),
      new Event(10, Event.EventType.ARRIVAL),
    };

    EventList eventList = new EventList();

    for (Event e : events) {
      eventList.addEvent(e);
    }

    eventList.printEvents();

  }
}
