package Class25;

import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;

public class E9TreeMaps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup= new TreeMap<>();
        makeup.put("Lipstick", 100.0);
        makeup.put("Blushon", 68.0);
        makeup.put("Eyeliner", 80.0);
        makeup.put("Lipstick", 150.0);
        makeup.put("Base", 25.0);
        System.out.println(makeup);
        //how to use arrays with maps
//Collection is father of all the frame
        Collection<String> keys=makeup.keySet();// this will only print the keys.
        System.out.println(keys);

        Collection<Double> value = makeup.values();
        System.out.println(value);
// will remove all elements that have a in them
       Collection <String> keys1= makeup.keySet();
       keys1.removeIf(x->x.contains("a"));
        System.out.println(makeup);


        //remove all values that are more then 80
        Collection<Double> values= makeup.values();
        values.removeIf(x->x>80);
        System.out.println(makeup);

    }
}
