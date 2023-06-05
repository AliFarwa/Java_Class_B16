package Class26;

import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.

        TreeMap<String,String> countries= new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("Pakistan","Islamabad");
        countries.put("India","New Dehli");
        countries.put("Canada","Toronto");

        //  Set<String> countrySet=countries.keySet();
        for (String s : countries.keySet()) {
            System.out.println(s);
        }
        System.out.println("******************");
        for(String v:countries.values()){
            System.out.println(v);
        }
        System.out.println("******************");
        // Var keywors is used here instead of typing Map.Entry<String,String>
        for(var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
