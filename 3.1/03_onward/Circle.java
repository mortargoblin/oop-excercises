public class Circle extends Shape{
  private double radius;

  public Circle(double radius, String color){
    super(color);
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.pow(radius,2) * Math.PI;
  }

  @Override
  public String toString(){
    return 
      "area of circle with radius of " 
      + radius + " is: " + calculateArea()
      + ". color: " + getColor();
  }

}
