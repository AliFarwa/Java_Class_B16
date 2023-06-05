package Class24;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {


        ArrayList<String>makeup= new ArrayList<>();
        makeup.add("nailpolish");
        makeup.add("Lipstick");
        makeup.add("Blush");

        ArrayList<String> fruit= new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");

        // to add all the abpve two
        ArrayList<String> grocery= new ArrayList<>();
        grocery.addAll(makeup);
        grocery.addAll(fruit);
        System.out.println(grocery);
    }
}