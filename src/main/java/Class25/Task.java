package Class25;

import java.util.*;

public class Task {
    public static void main(String[] args) {
//How can you remove all theduplicates from arraylist

        List<String> aList= new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
// we will convert arraylist to linked hashlist since we want to maintain oder and avoid duplication
        LinkedHashSet<String> names1=new LinkedHashSet<>(aList);
        System.out.println(names1);
           //OR
      TreeSet<String> names= new TreeSet<>(aList);
        System.out.println(names);
    }
}