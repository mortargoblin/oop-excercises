import java.util.Scanner;
public class BinaryConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Enter binary\n");

    int decimal = Integer.parseInt(scanner.nextLine(), 2);

    System.out.printf("decimal: %d", decimal);

    scanner.close();
  }
}
