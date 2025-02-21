class AN {
    public void move() {
        System.out.println("Animal is moving");
    }
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }}
class Bird extends AN {
    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
    @Override
    public void makeSound() {
        System.out.println("Bird sings a melody");
    }}
class Panthera extends AN {
    @Override
    public void move() {
        System.out.println("Panthera is walking");
    }
    @Override
    public void makeSound() {
        System.out.println("Panthera roars");
    }}
public class Animal {
    public static void main(String[] args) {
        AN genericAN = new AN();
        Bird sparrow = new Bird();
        Panthera lion = new Panthera();
        genericAN.move();
        genericAN.makeSound();
        sparrow.move();
        sparrow.makeSound();
        lion.move();
        lion.makeSound();
    }}