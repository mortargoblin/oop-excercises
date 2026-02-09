import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main() {
    Clock clock = Clock.getInstance();
    // maybe arrival process should be a singelton as well?
    ArrivalProcess arrival = new ArrivalProcess();
    ServicePoint service = new ServicePoint();

    final int EVENT_COUNT = 10;

    List<Event> eventList = new ArrayList<>();

    for (int i = 0; i < EVENT_COUNT; i++) {
      arrival.createEvent(EventType.ARRIVAL, clock, eventList);
    }

    for (Event event : eventList) {
      // add customers to queue :DDDD
      service.addCustomer(new Customer());
      System.out.printf(
          "Type: %s, Time: %f\n",
          event.getType(), event.getTime()
          );
    }
  }
}
