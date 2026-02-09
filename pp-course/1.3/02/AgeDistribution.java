
public class AgeDistribution {

  public static void main() {
    int ITERATIONS = 1000;
    int MAXAGE = 31;

    int agedistribution[][] = {
      // 5 people total (fictional)
      {20, 21}, // 1 person aged 21 = 20%
      {60, 22}, // 2 people aged 22 = 40%
      {80, 25},
      {100, MAXAGE}
    };

    int generatedAges[] = new int[MAXAGE+1];
    
    for (int i = 1; i < ITERATIONS; i++) {
      int random = (int) (Math.random()*100)+1; // 1-100
      int j = 0;
      while (random > agedistribution[j][0]) {
        j++;
      }
      // j reaches correct bracket. increment people counter
      generatedAges[agedistribution[j][1]]++;
    }

    System.out.printf("RESULTS\n");
    for (int age = 0; age <= MAXAGE; age++) {
      if (generatedAges[age] != 0) {
        System.out.printf(
            "%d, %d, %-8.2f\n",
            age, generatedAges[age], ((double)generatedAges[age])/ITERATIONS
            );
      }
    }
  }
}
