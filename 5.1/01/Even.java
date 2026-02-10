public class Even extends Thread {
  private int range;
  public Even(int range) {
    this.range = range;
  }
  public void run() {
    for (int i = 0; i < range; i++) {
      if (i % 2 == 0) {
        System.out.printf("EVEN: %d\n", i);
      }
    }
  }
}
