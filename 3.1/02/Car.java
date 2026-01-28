public class Car {
  private double speed = 0;
  private double gasolineLevel;
  private String typeName;
  private double gasolineConsumption = 1;

  public Car(
      String typeName, 
      Double gasolineLevel
      ) {
    this.gasolineLevel = gasolineLevel;
    this.typeName = typeName;   
  }

  public void accelerate() {
    if (gasolineLevel > 0) {
      speed += 10;
      expendGasoline(gasolineConsumption);
    }
    else
      speed = 0;
  }
  void decelerate(Double amount) {
    if (gasolineLevel > 0) {
      if (amount > 0)
        speed = Math.max(0, speed - amount);
        expendGasoline(gasolineConsumption);
    } else
      speed = 0;
  }
  double getSpeed() {
    return speed;
  }
  void setSpeed(Double arg) {
    speed = arg;
  }
  String getTypeName() {
    return typeName;
  }
  void fillTank() {
    gasolineLevel = 100;
  }
  double getGasolineLevel() {
    return gasolineLevel;
  }
  void expendGasoline(double gasolineConsumption) {
    gasolineLevel -= gasolineConsumption;
  }
}

