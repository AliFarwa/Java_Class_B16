package Class25;

import java.util.HashMap;

public class E7Maps {
    public static void main(String[] args) {
// one class acts like key and one value

        HashMap<String, Integer> grocery = new HashMap<>();
        grocery.put("Apple",2);
        grocery.put("Soap", 10);
        grocery.put("Eggs", 3);
        grocery.put("Milk", 6);
        grocery.put("Apple",1);//it will not print first apple


        System.out.println(grocery);
        System.out.println(grocery.size());//will ignore the duplicate
        System.out.println(grocery.containsKey("Bamama"));//key not present so false
        System.out.println(grocery.containsKey("Eggs"));//true
        System.out.println(grocery.containsValue(10));
        System.out.println(grocery.isEmpty());//false since there are elements in the array


    }
}