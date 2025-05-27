// public enum ShapeType {
//     CIRCLE , SQUARE
// }

// public class Shape {
//     public ShapeType type;
//     public double radius; // for Circle
//     public double side; // for Square
// }

// public class AreaCalculator {
//     public double area(Shape shape) {
//         if (shape.type == ShapeType.CIRCLE) {
//             return Math.PI * shape.radius * shape.radius;
//         } else if (shape.type == ShapeType.SQUARE) {
//             return shape.side * shape.side;
//         }
//         return 0;
//     }
// }

// OCP adhering version
public interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;
    public double area() { return Math.PI * radius * radius; }
}

class Square implements Shape {
    private double side;
    public double area() { return side * side; }
}