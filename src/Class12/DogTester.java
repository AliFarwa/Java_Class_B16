package Class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog = new Dog();
        actualDog.name = "Jacky";
        actualDog.age = 50;
        actualDog.breed = "German";
        actualDog.Colour = "Black";
        actualDog.weight = 50;
        actualDog.isFat =true;

        actualDog.bark();


        Dog obj=new Dog();

        obj.name = "Spark";
        obj.age = 20;
       obj.breed = "German";
        obj.Colour = "Brown";
        obj.weight = 10;
        obj.isFat =true;



    }
}
