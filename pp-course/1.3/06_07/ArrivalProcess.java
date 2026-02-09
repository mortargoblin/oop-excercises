// eduni is gitignored because i cant find the license
import eduni.distributions.Normal;
import java.util.List;

public class ArrivalProcess {
  // with system.nanotime seed (long)
  // this sometimes returns NaN ??
  // so no seed
  Normal random = new Normal(30, 25); // arbitrary values

  public void createEvent(
      // eventList is a dest pointer :DD
      EventType type, 
      Clock clock, 
      List<Event> eventList
      ) {
    clock.addTime(random.sample());
    eventList.add(new Event(type, clock.getTime()));
  }
}
