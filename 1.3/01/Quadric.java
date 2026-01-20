import java.util.Scanner;

public class Quadric {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.printf("Enter a\n");
    double a = Double.parseDouble(scanner.nextLine());
    System.out.printf("Enter b\n");
    double b = Double.parseDouble(scanner.nextLine());
    System.out.printf("Enter c\n");
    double c = Double.parseDouble(scanner.nextLine());

    scanner.close();

    double formula = (b*b) - (4*a*c);

    double r1;
    double r2;

    if (formula == 0) {
      r1 = r2 = -b / (2 * a);
      System.out.printf("Roots: %f, %f\n", r1, r2);
    } else if (formula > 0) {
      r1 = (-b + Math.sqrt(formula)) / (2*a);
      r2 = (-b - Math.sqrt(formula)) / (2*a);
      System.out.printf("Roots: %f, %f\n", r1, r2);
    } else {
      System.out.printf("No real roots\n");
    }
  }
}
