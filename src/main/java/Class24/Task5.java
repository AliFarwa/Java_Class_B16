package Class24;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        //Create an arrayList of even numbers from 1 to 500.
        // Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 2; i <500 ; i=i+2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.removeIf(number->number%5==0);
        System.out.println(numbers);

    }
}