import vehicles.Bicycle;
import vehicles.Car;

public class VehicleExample {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(20);
        Car car = new Car(100);

        System.out.println("Bike top speed: " + bike.getTopSpeed());
        System.out.println("Car top speed: " + car.getTopSpeed());

        System.out.println("Bike wheels: " + bike.wheels());
        System.out.println("Car wheels: " + car.wheels());
    }
}