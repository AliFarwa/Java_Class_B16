package Class20;

public class Animal {
    //we have to create 3 animal classes Dog,Cat,horse, create 5 methods in each class
    //if u want u can create some fields and constructors as well.
    String color;
    String breed;
    int age;

    public Animal(String color, String breed, int age) {
        this.color = color;
        this.breed = breed;
        this.age = age;
        System.out.println(color + " "+age+ " "+breed);
    }

    void bark() {
        System.out.println("Bark");
    }

   void sleep() {
        System.out.println("zzzzZZZ");
    }

    void run() {
        System.out.println(" run ");
    }

}

class Dog extends Animal {
    public Dog(String color, String breed, int age) {
        super(color, breed, age);
    }
@Override
void sleep(){
    System.out.println(" I like sleep for 10hrs");
}

}

class Cat extends Animal {
    public Cat(String color, String breed, int age) {
        super(color, breed, age);
    }
}

class horse extends Animal {
    public horse(String color, String breed, int age) {
        super(color, breed, age);
    }
}

class AnimalTester {
    public static void main(String[] args) {
        Dog obj = new Dog("Black", "german", 10);
        obj.run();
        obj.bark();
        obj.sleep();

        Cat obj1 = new Cat("Brown", "german", 20);
        obj1.run();
        obj1.bark();
        obj1.sleep();

        horse obj2 = new horse("Brown", "german", 20);
        obj2.run();
        obj2.bark();
        obj2.sleep();
    }
}