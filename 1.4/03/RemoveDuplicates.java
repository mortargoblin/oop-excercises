import java.util.Scanner;
public class RemoveDuplicates {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Enter desired number of integers\n");
    int size = Integer.parseInt(scanner.nextLine());

    int integersIn[] = new int[size];

    // if this wasn't gc:d,
    // this oversized array could
    // cause issues :DDDDD
    int integersOut[] = new int[size];

    for (int i = 0; i < size; i++){
      System.out.printf("Enter integer n.%d\n", i + 1);
      integersIn[i] = Integer.parseInt(scanner.nextLine());
    }

    int uniqueIdx = 0;
    for (int i = 0; i < integersIn.length; i++) {
      boolean isUnique = true;
      for (int j : integersOut) {
        if (integersIn[i] == j) {
          isUnique = false;
          break;
        }
      }
      if (isUnique) {
        integersOut[uniqueIdx] = integersIn[i];
        uniqueIdx++;
      }
    }
    System.out.printf("Unique array\n");
    for (int i = 0; i < uniqueIdx; i++) {
      System.out.printf("%d ", integersOut[i]);
    }
    System.out.printf("\n");
  }
}
