package Class21;

public class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Animals sleep");
    }
    void sleep(){
        System.out.println("Animals sllep from 1 to 10 hours");
    }
    void eat(){
        System.out.println("Animals eat many different things");
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meow meow....");
    }
    @Override
    void eat(){
        System.out.println("Cats like to eat fish");
    }
    @Override
    void sleep(){
        System.out.println("Cats like to sleep 15 hours on Average");
    }

}
class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override

    void speak() {
        System.out.println("woof woof....");
    }

    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }
    @Override
    void eat(){
        System.out.println("Dogs eat bones");
    }
}
class Horse extends Animal{
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak() {
        System.out.println("neigh neigh....");
    }
    @Override
    void sleep(){
        System.out.println("Horses sleep 8 hours");
    }
    @Override
    void eat(){
        System.out.println("Horses like carrots");
    }
}