
enum Planet{
    MERCURY (3.30e23, 2439.7), VENUS (4.87e24, 6051.8), EARTH (5.97e24, 6371.0), MARS (0.642e24, 3389.5);
    public double getMass() {
        return mass;
    }
    public double getRadius() {
        return radius;
    }
    private final double mass;
    private final double radius;
    private final double G =6.674e-11;
    Planet(double mass, double radius){
        this.mass=mass;
        this.radius=radius;
    }
    public double surfaceGravity(){
        
        double g = G*(mass/(radius*radius));
        return g;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Planet.EARTH.getMass());
        System.out.println(Planet.EARTH.getRadius());
        System.out.println(Planet.EARTH.surfaceGravity());

    }
    
}