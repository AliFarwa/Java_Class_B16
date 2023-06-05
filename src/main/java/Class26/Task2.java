package Class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.

        Map<Integer,String> BestBuyStore= new LinkedHashMap<>();
        BestBuyStore.put(7664847, "Printer");
        BestBuyStore.put(7879885, "TV");
        BestBuyStore.put(7664856, "Machine");
        BestBuyStore.put(76692546, "Computer");
        for (var best : BestBuyStore.entrySet()) {
            System.out.println(best.getKey()+" = "+best.getValue());
        }
    }
}
