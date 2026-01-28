public class Bus extends Car {
  private int passangerCapacity;
  private int passangerCount = 0;

  public Bus(
      String typeName, 
      Double gasolineLevel,
      int passangerCapacity
      ) {
    super(typeName, gasolineLevel);
    this.passangerCapacity = passangerCapacity;
  }

  public void passangerEnter(int num) {
    if (passangerCount + num <= passangerCapacity) {
      passangerCount += num;
    }
  }

  public void passangerExit(int num) {
    if (passangerCount > 0) {
      passangerCount -= num;
    }
  }

  public int getPassangerCount() {
    return passangerCount;
  }
}
