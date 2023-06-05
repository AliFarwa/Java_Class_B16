package Class21;
//create 3 animals like Dog Cat and Horse
//    define 3 common methods in each class like speak eat and sleep.
//    create the object of all the classes and call the methods.
public class AnimalTester21 {
    public static void main(String[] args) {
        Dog dog=new Dog("Shaggy","Brown","German");
        dog.printInfo();

        // parent class variables can store the objects of the child class.
        Animal dog1=new Dog("Shaggy","Brown","German");
        dog1.printInfo();

        Animal[] animals={new Dog("Shaggy","Brown","German"),new Cat("Tom", "Blue","persian")};
        for (int i = 0; i<animals.length; i++) {
            animals[i].printInfo();

            //OR

          //  for (Animal animal : animals) {
             //   animal.printInfo();

            }

        }
    }

