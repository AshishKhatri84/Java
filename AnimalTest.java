@SuppressWarnings("unused")
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat.");
    }
    @Override
    void sleep() {
        System.out.println("Lion sleeps in the den.");
    }}
class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats meat and sometimes hunts in the water.");
    }
    @Override
    void sleep() {
        System.out.println("Tiger sleeps in the grassy areas.");
    }}
class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass and leaves.");
    }
    @Override
    void sleep() {
        System.out.println("Deer sleeps in open fields or forests.");
    }}
public class AnimalTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();
        lion.eat();
        lion.sleep();
        tiger.eat();
        tiger.sleep();
        deer.eat();
        deer.sleep();
}}