import java.util.Scanner;

public class Tri {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float leg_1;
    float leg_2;

    System.out.printf("Enter length of leg 1\n");
    leg_1 = Float.parseFloat(scanner.nextLine());

    System.out.printf("Enter length of leg 2\n");
    leg_2 = Float.parseFloat(scanner.nextLine());

    scanner.close();

    double hypotenuse = Math.sqrt(Math.pow(leg_1, 2f) + (Math.pow(leg_2, 2f)));

    System.out.printf("Hypotenuse: %f\n", hypotenuse);
  }
}
