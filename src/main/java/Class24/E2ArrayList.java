package Class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
// Print elements from a arrarylist all 4 ways
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(200);
        System.out.println(numbers);
        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println("******************************");
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));// to get value of all elements
        }
        System.out.println("**************************");
        int i=0;
        while ( i < numbers.size()){
            System.out.println(numbers.get(i));
            i++;
        }
        System.out.println("************");
        int j=0;
        do {
            System.out.println(numbers.get(j));
            j++;
        }while (j< numbers.size());

    }
}