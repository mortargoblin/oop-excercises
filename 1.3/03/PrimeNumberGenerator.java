import java.util.Scanner;
public class PrimeNumberGenerator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Enter start\n");
    int start = Integer.parseInt(scanner.nextLine());

    System.out.printf("Enter end\n");
    int end = Integer.parseInt(scanner.nextLine());

    scanner.close();

    boolean isPrime;

    for (int num = start; num <= end; num++) {
      isPrime = true;
      for (int i = 2; i <= num - 1; i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
      System.out.printf("%d %b\n", num, isPrime);
    }
  }
}
