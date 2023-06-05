package Class17;

public class Dog {

    String name;
    String colour;
    String breed;
    int age;

    Dog(String dogName, String dogColor, String dogBreed, int dogAge){
        name=dogName;
        colour=dogColor;
        breed=dogBreed;
        age=dogAge;
    }



   void printInfo(){
     System.out.println("The Dog name is " +name+" "+colour+" "+breed+" "+age);
    }







}
