package shape;

public class Circle extends Shape {
  double radius;
  public Circle(String name, double radius){
    super(name);
    this.radius = radius;
  }

  @Override
  public double area(){
    double area = 3.14*(radius*radius);
    return area;
  }
  
}
