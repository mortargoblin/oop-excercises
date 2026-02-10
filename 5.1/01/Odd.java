public class Odd extends Thread {
  private int range;
  public Odd(int range) {
    this.range = range;
  }
  public void run() {
    for (int i = 0; i < range; i++) {
      if (i % 2 != 0) {
        System.out.printf("ODD: %d\n", i);
      }
    }
  }
}
