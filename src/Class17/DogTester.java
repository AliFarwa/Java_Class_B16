package Class17;

public class DogTester {
    public static void main(String[] args) {

      /*  Dog obj1 =new Dog();
         obj1.name="tommy";
         obj1.colour="Black";
         obj1.breed="German";
         obj1.age=2;

        Dog obj2 =new Dog();
        obj2.name="tim";
        obj2.colour="white";
        obj2.breed="persian";
        obj2.age=4;

        Dog obj3=new Dog();
        obj2.name="sam";
        obj2.colour="brown";
        obj2.breed="Husky";
        obj2.age=5;

        Dog obj4 =new Dog();
        obj2.name="tommy";
        obj2.colour="Black";
        obj2.breed="German";
        obj2.age=2;

        Dog obj5 =new Dog();
        obj2.name="tommy";
        obj2.colour="Black";
        obj2.breed="German";
        obj2.age=2;

    }*/

Dog dog1=new Dog("Jack", "Black", "Persian",10 );
Dog dog2=new Dog("Shaggy", "White", "British",7 );
Dog dog3=new Dog("Fluffy", "Pink", "German",6 );
Dog dog4=new Dog("Papi", "Brown", "Spanish",5);
dog1.printInfo();
dog2.printInfo();
dog3.printInfo();
dog4.printInfo();
    }
}