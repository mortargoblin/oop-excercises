import java.util.Scanner;

public class MultiplicationExam {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      int points = 0;
      for (int i = 0; i < 10; i++) {
        int num1 = (int) (Math.random() * 10) + 1;
        int num2 = (int) (Math.random() * 10) + 1;
        System.out.printf("%d * %d\n", num1, num2);
        int ans = Integer.parseInt(scanner.nextLine());
        if (ans == num1 * num2) {
          points++;
        }
      }
      if (points <= 10) {
        System.out.printf("10 points reached!\n");
        break;
      } else {
        System.out.printf("%d points reached\n", points);
      }
    }

    scanner.close();
  }
}
