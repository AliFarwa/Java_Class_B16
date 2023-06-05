package Class7;

import java.util.Scanner;

public class E13Whileloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number greater than 1?");
        int number = scan.nextInt();
        int counter = 1;
        while (counter <= number)
        {
            System.out.print(counter + " ");
           counter++;

        }
    }
}