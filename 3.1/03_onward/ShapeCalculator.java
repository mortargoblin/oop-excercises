public class ShapeCalculator {
  public static void main(String[] args) {
    
    Shape[] shapes = {
      new Circle(10, "green"), 
      new Rectangle(6, 3, "blue"),
      new Triangle(6, 3, "red")
    };

    for (Shape shape : shapes) {
      System.out.printf("%s\n", shape.toString());
    }
  }
}
