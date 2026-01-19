public class Pyramid {
  public static void main(String[] args) {
    int width = 7;
    int height = 4;
    int whitespace = (int) (width / 2);
    char symbol = ' ';
    System.out.printf("PYRAMID\n");
    System.out.printf("width: %d, height: %d\n\n", width, height);
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (j < whitespace || j > width - whitespace -1) {
          symbol = ' ';
        } else {
          symbol = '*';
        } 
          
        System.out.printf("%c", symbol);
      }
      whitespace--;
      System.out.printf("\n");
    }
  }
}
