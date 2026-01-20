import java.util.Scanner;

public class MaxSubarray {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Enter desired number of integers\n");
    int size = Integer.parseInt(scanner.nextLine());

    int integers[] = new int[size];

    for (int i = 0; i < size; i++){
      System.out.printf("Enter integer n.%d\n", i + 1);
      integers[i] = Integer.parseInt(scanner.nextLine());
    }

    scanner.close();

    int end = 0;
    int start = 0;
    int currentStart = 0;
    int maxSum = 0;
    int peak = 0;

    for (int i = 1; i < integers.length; i++){
      if (integers[i] > maxSum + integers[i]) {
        maxSum = integers[i];
        currentStart = i;
      } else {
        maxSum += integers[i];
      }
      if (maxSum > peak) {
        peak = maxSum;
        start = currentStart + 1;
        end = i + 1;
      }
    }

    System.out.printf("Max sum: %d\n", peak);
    System.out.printf("Start: %d. End: %d\n", start, end);
  }
}
