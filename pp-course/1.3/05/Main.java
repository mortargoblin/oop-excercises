public class Main {
  public static void main() {
    
    // init singelton clock :D
    Clock clock = Clock.getInstance();

    clock.addTime(100);
    
    System.out.printf("%f\n", clock.getTime());
  }
}
