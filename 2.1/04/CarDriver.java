public class CarDriver {
  public static void main(String[] args) {
    Car myCar;

    int cruiseSpeed = 50;

    myCar = new Car("Toyota Corolla");
    myCar.fillTank();

    for (int i = 0; i < 10; i++) {
      // myCar.accelerate();
      if (myCar.cruiseControl(cruiseSpeed)) {
      System.out.println(
          myCar.getTypeName() + ": speed is " + 
          myCar.getSpeed() + " km/h"
          );
      } else {
        System.out.printf(
            "cruise speed value invalid\n"
            );
      }
    }

    while (myCar.getSpeed() > 0) {
      myCar.decelerate(15);
      System.out.println(
          myCar.getTypeName() + ": speed is " + 
          myCar.getSpeed() + " km/h"
          );
    }
  }
}
