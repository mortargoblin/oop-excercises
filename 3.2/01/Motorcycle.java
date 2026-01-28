public class Motorcycle implements Vehicle {
  private String type = "Bus";
  private String fuel = "Gas";
  private String color = "Blue";

  @Override
  public void start() {
    System.out.printf("Bus is starting...\n");
  }

  @Override
  public void stop() {
    System.out.printf("Bus is stopping...\n");
  }

  @Override
  public void getInfo() {
    System.out.printf(
        "Type:  %s\nFuel:  %s\nColor: %s\n",
        type, fuel, color
        );
  }

}

