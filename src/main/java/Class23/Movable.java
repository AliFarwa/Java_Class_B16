package Class23;

public interface Movable {
    //, both interfaces and abstract classes are used to declare abstract
    // methods. However, an abstract class can have abstract and non-abstract
    // methods, while an interface can only have abstract methods. Additionally,
    // a class can only extend one
    // abstract class, but can implement multiple interfaces.

     int age=12;
    void move();
}
interface Washable{
    void wash();
}
class Dog implements Movable{

    @Override
    public void move() {
        System.out.println(" Dog is Moving.........");
    }
}
class Cat implements Movable{
    @Override
    public void move() {
        System.out.println(" Cats can also move");
    }
}
class Horse{
    public void move() {
        System.out.println(" Horses can also move");
    }
}
