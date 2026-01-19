import java.util.Scanner;

public class ObsoleteMeasurements {
  public static void main(String[] args) {

    double luoti;
    double naula;
    double leiviska;

    Scanner scanner = new Scanner(System.in);

    System.out.printf("Enter grams\n");
    double gram = Double.parseDouble(scanner.nextLine());

    scanner.close();

    luoti = gram / 13.28f;
    naula = Math.floor(luoti / 32f);
    leiviska = Math.floor(naula / 20f);

    luoti = luoti % 32f;
    naula = naula % 20f;

    System.out.printf(
        "%.2f grams is %.0f leiviskä, %.0f naula, and %.2f luoti.", 
        gram, leiviska, naula, luoti
        );
  }
}
