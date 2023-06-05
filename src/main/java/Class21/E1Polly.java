package Class21;

public class E1Polly {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("Shaggy", "Brown", "German"),
                new Cat("Tom", "Blue", "persian"),
                new Horse("Kal", "Black", "Turkish")};
                 for (Animal animal : animals) {
                     animal.eat();
                     animal.speak();
                     animal.sleep();
                     animal.printInfo();
        }

    }
}