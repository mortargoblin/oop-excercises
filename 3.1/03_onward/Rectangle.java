public class Rectangle extends Shape {
  double side1;
  double side2;

  public Rectangle(double side1, double side2, String color) {
    super(color);
    this.side1 = side1;
    this.side2 = side2;
  }

  public double calculateArea() {
    return side1 * side2;
  }

  @Override
  public String toString(){
    return 
      "area of rect with sides of " 
      + side1 + " and " + side2 + 
      " is: " + calculateArea()
      + ". color: " + getColor();
  }
}
