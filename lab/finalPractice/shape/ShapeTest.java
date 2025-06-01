package shape;

public class ShapeTest {
   public static void main(String[] args) {
      Shape[] shapelist = new Shape[]{
        new Circle("cc", 2.0),
        new Rectangle("rr",3,4)
      };

    for (Shape shape : shapelist){
      System.out.println(shape.getName()+" "+shape.area());
    }
  }
  
}
