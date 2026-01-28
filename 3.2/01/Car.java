public class Car implements Vehicle {
  private String type = "Car";
  private String fuel = "Gas";
  private String color = "Red";

  @Override
  public void start() {
    System.out.printf("Car is starting...\n");
  }

  @Override
  public void stop() {
    System.out.printf("Car is stopping...\n");
  }

  @Override
  public void getInfo() {
    System.out.printf(
        "Type:  %s\nFuel:  %s\nColor: %s\n",
        type, fuel, color
        );
  }

}
