package Class17;

import java.util.concurrent.Callable;

public class Car {

    String make;
    String model;
    int engineCC;
    String color;

    Car(String make, String model, int engineCC, String color) {
        this.make = make;
        this.model = model;
        this.engineCC = engineCC;
        this.color = color;

    }
    Car(){
        System.out.println("O Argument Passed");
    }

    void printInfo() {
        System.out.println(make + " " + model + " " + engineCC + " " + color);
    }


};
