package Class17;

public class Food {

    String name="Pasta";


    void printFood(){
        String name="Burger";
        // always local variables are preffered
        System.out.println(name);
        System.out.println(this.name);
    }

}
