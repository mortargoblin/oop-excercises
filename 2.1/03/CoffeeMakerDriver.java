public class CoffeeMakerDriver {
  public static void main(String[] args) {
    CoffeeMaker coffeeMaker = new CoffeeMaker();

    coffeeMaker.toggleOnOffState();
    if (coffeeMaker.getOnOffState()) {
      System.out.printf("Coffee Maker is on\n");
    } else {
      System.out.printf("Coffee Maker is off\n");
    }

    coffeeMaker.setType("espresso");
    System.out.printf("Type: %s\n", coffeeMaker.getType());

    coffeeMaker.setAmount(50);
    System.out.printf("Amount: %d\n", coffeeMaker.getAmount());

    coffeeMaker.toggleOnOffState();
    if (coffeeMaker.getOnOffState()) {
      System.out.printf("Coffee Maker is on\n");
    } else {
      System.out.printf("Coffee Maker is off\n");
    }
  }
}
