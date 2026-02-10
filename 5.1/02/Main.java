public class Main {
  public static void main() {
    final int SIZE = 10000;
    final int THREADS = Runtime.getRuntime().availableProcessors();
    final int RANGE = SIZE / THREADS; // should be int :DD
                                      // decimals could break this

    int[] array = new int[SIZE];
    for (int i = 0; i < SIZE; i++) {
      // should be 1 to 10
      array[i] = (int) (Math.random() * 10) + 1;
    }

    System.out.printf("thread count: %d\n", THREADS);
    System.out.printf("range per thread: %d\n", RANGE);

    // start threads
    ArraySum[] thread_array = new ArraySum[THREADS];
    int start = 0;
    int end = 0;
    for (int i = 0; i < THREADS; i++) {
      start = end;
      end += RANGE;
      thread_array[i] = new ArraySum(array, start, end);
      thread_array[i].start();
      // System.out.printf("thread %d started\n", i);
    }
    
    int sum = 0;
    for (ArraySum thread : thread_array) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        System.out.printf("thread interrupted\n");
      }
      sum += thread.getSum();
    }

    System.out.printf(
        "array size: %d\ntotal sum: %d\n",
        SIZE, sum
        );
  }
}
