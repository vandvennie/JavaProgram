package shape;

public class Rectangle extends Shape {
  double width, height;
  public Rectangle(String name, double width, double height){
    super(name);
    this.width = width;
    this.height=height;
  }

  @Override
  public double area(){
    double area = width*height;
    return area;
  }
  
}
