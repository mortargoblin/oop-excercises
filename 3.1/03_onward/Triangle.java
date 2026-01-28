public class Triangle extends Shape {
  double width;
  double height;

  public Triangle(double width, double height, String color) {
    super(color);
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    return width * height / 2;
  }

  @Override
  public String toString(){
    return 
      "area of tri with height of " 
      + height + " and width of" + width
      + " is: " + calculateArea()
      + ". color: " + getColor();
  }
}
