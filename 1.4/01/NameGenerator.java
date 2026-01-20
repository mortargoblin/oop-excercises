import java.util.Scanner;
public class NameGenerator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] firstNames = {"Aapo", "Arni", "Mikko", "Liisa", "Nooa"};
    String[] lastNames = {"Virtanen", "Järvinen", "Kokkonen", "Jokinen", "Aho"};

    System.out.printf("Enter desired number of random names\n");
    int num = Integer.parseInt(scanner.nextLine());

    scanner.close();

    for (int i = 0; i < num; i++) {
      String randFirstName = firstNames[(int)(Math.random() * firstNames.length)];
      String randLastName = lastNames[(int)(Math.random() * lastNames.length)];
      System.out.printf("%s %s\n", randFirstName, randLastName);
    }
  }
}
