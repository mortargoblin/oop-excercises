
public class BusDriver {
  public static void main(String[] args) {
    Car car = new Car("corolla", 80d);
    Bus bus = new Bus("bussi", 60d, 100);

    System.out.printf("%f\n", bus.getGasolineLevel());
    bus.passangerEnter(10);
    System.out.printf("%d\n", bus.getPassangerCount());
  }
}
