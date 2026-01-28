public class SportsCar extends Car {
  private double gasolineConsumption = 2;

  public SportsCar(
      String typeName, 
      Double gasolineLevel
      ) {
    super(typeName, gasolineLevel);
  }

  @Override
  public void accelerate() {
    if (getGasolineLevel() > 0) {
      setSpeed(getSpeed() + 20);
      expendGasoline(gasolineConsumption);
    } else {
      setSpeed((double)0);
    }
  }

  public void decelrate(Double amount) {
    super.decelerate(amount + 10);
  }
}
