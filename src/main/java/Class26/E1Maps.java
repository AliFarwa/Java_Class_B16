package Class26;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
        Map<String,Double> drinks=new HashMap<>();
        drinks.put("coke",2.00);
        drinks.put("Milk",5.00);
        drinks.put("Mango Juice",3.00);
        drinks.put("Tea",3.00);
        drinks.put("Coffee",4.99);
        //  Set<String> keys=drinks.keySet();// to get the keys
        drinks.keySet().removeIf(x->x.contains("i"));
        //  Collection<Double> values=drinks.values();// to get value
        drinks.values().removeIf(x->x>3.0);

        //remove only those which contains letter i and their price is less then 3
        drinks.entrySet();




    }
}
