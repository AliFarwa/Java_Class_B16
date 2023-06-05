package Class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
//arraylist is the class and <> in this we stor class whose object we want to create. like Dog, Integar, String
        //in line 9 we are creating object of car class and storing in variable car1.
        Car car1= new Car("Toyota", "Prius");
        Car car2= new Car("Honda", "Civic");
        Car car3= new Car("BMW", "I7");
        ArrayList<Car> arrayList= new ArrayList<>();//here we are creating object of Class car
        //creating object of class and storing it into arraylist
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        for (Car c : arrayList) {
            c.printInfo();
        }
    }

}
class Car{
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    void printInfo(){
        System.out.println(make+ " "+model);
    }
}