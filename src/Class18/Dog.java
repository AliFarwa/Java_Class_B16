package Class18;

public class Dog {

    String name;
    String colour;
String breed;

int age;
double weight;

Dog(String name, String colour, String breed, int age, double weight){
/*this.name=name;
this.colour=colour;
this.breed=breed;
this.age=age;*/
    //calling the constructor from the same class which takes name color
    //breed and age as parameter
this(name,colour,breed,age);
this.weight=weight;

}
    Dog(String name, String colour, String breed, int age){
        this.name=name;
        this.colour=colour;
        this.breed=breed;
        this.age=age;


}
}