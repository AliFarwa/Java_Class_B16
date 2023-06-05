package Class23;

public class MovableTester {
    public static void main(String[] args) {
        Movable move= new Cat();
        Movable[] m={new Dog(),new Cat()};
        for (Movable movable : m) {
            movable.move();
        }

    }
}
