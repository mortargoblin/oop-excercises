public class Main {
  public static void main() {
    Even even = new Even(30);
    Odd odd = new Odd(30);

    even.start();
    odd.start();
  }
}
