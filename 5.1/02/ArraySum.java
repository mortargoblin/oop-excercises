public class ArraySum extends Thread {
  private int[] array;
  private int start;
  private int end;
  private int sum = 0;

  public ArraySum(int[] array, int start, int end) {
    this.array = array;
    this.start = start;
    this.end = end;
  }

  public void run() {
    // ends and end - 1
    // convenient for me
    for (int i = start; i < end; i++) {
      sum += array[i];
      // System.out.printf("%d ", sum);
    }
  }
  
  public int getSum() {
    return sum;
  }
}
