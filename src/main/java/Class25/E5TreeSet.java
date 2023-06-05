package Class25;

import java.util.TreeSet;

public class E5TreeSet {
    public static void main(String[] args) {

        // this will follow asscending oder and same no duplicates
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("2");
        fruit.add("3");
        fruit.add("6");
        fruit.add("9");
        fruit.add("8");
        fruit.add("8");
        System.out.println(fruit);

        System.out.println();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
    }
    }

