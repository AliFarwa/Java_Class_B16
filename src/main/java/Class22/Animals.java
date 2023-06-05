package Class22;

import Class21.Animal;

public abstract class Animals {
   abstract void speak();
   abstract void sleep();
    abstract void eat();
}
class Dog extends Animals{
@Override
void speak(){
    System.out.println(" Dog speaks");
}
@Override
void sleep(){
    System.out.println("Dog is sleeping");
}
@Override
void eat(){
    System.out.println("Dog eats");
}


}
class Cat extends Animals{
    @Override
    void speak(){
        System.out.println(" Cat speaks");
    }
    @Override
    void sleep(){
        System.out.println("Cat is sleeping");
    }

    void eat(){
        System.out.println("Cat eats");
    }

}
class Horse extends Animals{
    @Override
    void speak(){
        System.out.println("Horse speaks");
    }
    @Override
    void sleep(){
        System.out.println("Horse is sleeping");
    }
    @Override
    void eat(){
        System.out.println("Horse eats");
    }

}
class AnimalsTester {
    public static void main(String[] args) {


        Animals[] animal = {new Dog(), new Cat(), new Horse()};
        for (Animals a: animal) {
            a.eat();
            a.sleep();
            a.speak();

        }
    }
}

