@SuppressWarnings("unused")
abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with a turn of the key.");
    }
    @Override
    void stopEngine() {
        System.out.println("Car engine stopped by turning off the ignition.");
    }}
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started by kicking the starter.");
    }
    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped by turning the key or using the kill switch.");
    }}
public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.startEngine();
        car.stopEngine();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }}