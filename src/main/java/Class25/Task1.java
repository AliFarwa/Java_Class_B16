package Class25;

import java.util.TreeSet;

public class Task1 {
    //Create a Set in which you need to add names of the countries. In this set we want all objects to be sorted
    // in alphabetical order. Using 2 different ways retrieve all elements from set.
    public static void main(String[] args) {


        TreeSet<String> countries = new TreeSet<>();
       countries.add("Pakistan");
       countries.add("India");
       countries.add("USA");
       countries.add("Canada");
        System.out.println(countries);
        for (String country : countries) {
            System.out.println(country);

        }

    }
}