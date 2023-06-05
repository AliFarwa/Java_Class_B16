package Class24;

import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("nailpolish");
        grocery.add("Lipstick");
        grocery.add("Blush");
        grocery.add("Apple");
        grocery.add("Banana");

        ArrayList<String> fruit= new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        grocery.remove("Apple");// to remove one by one
        grocery.removeAll(fruit);//remove all//
         }
}
