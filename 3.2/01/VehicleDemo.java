public class VehicleDemo {
  public static void main(String[] args) {

    Car car = new Car();
    Bus bus = new Bus();
    Motorcycle motorcycle = new Motorcycle();

    car.start();
    car.stop();
    car.getInfo();

    bus.start();
    motorcycle.start();

  }
}
