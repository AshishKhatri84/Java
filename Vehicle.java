class VC
{
    void run(){System.out.println("Vehicle is Running");}
}
class Bike2 extends VC
{
    void run(){System.out.println("Bike is running safely");}
}
public class Vehicle
{
public static void main(String args[])
{
    Bike2 obj=new Bike2();
    obj.run();
}
}