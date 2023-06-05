package Class17;

public class Laptop {

    String make;
    String model;
    double batteryLife;
    int Storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchPad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.Storage = storage;
        this.camera = camera;
        this.touchPad = touchPad;
        this.touchScreen = touchScreen;
    }

    public static void main(String[] args) {
        Laptop dellG5=new Laptop("Dell", "g5",3,512,true,false,false);

    }

}
