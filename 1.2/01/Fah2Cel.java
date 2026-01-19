import java.util.Scanner;

public class Fah2Cel {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    float fahrenheit;
    float celsius;

    System.out.printf("Enter Fahrenheit temperature.\n");

    fahrenheit = Integer.parseInt(scanner.nextLine());
    celsius = (fahrenheit - 32f) / (1.8f);

    System.out.printf("%.2f F = %.2f C\n", fahrenheit, celsius);

    scanner.close();
  }

}
