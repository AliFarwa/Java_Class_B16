package Class24;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that
        ArrayList<String> names = new ArrayList<>();
        names.add("Farwa");
        names.add("Dania");
        names.add("Halima");
        names.add("Kabber");
        names.add("Ali");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Farwa"));
        System.out.println(names.size());
    }
}
