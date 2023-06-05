package Class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        // all websites ask you for log in like Face book. //

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number");
        int num = scan.nextInt(0);
        if (num < 5) {
            System.out.println("5 is positive");
        }
        if (num > -2) {
            System.out.println("-2 is negative");
            if (num == 0) {
                System.out.println("Entered number is equal to zero");
            }
        }
    }
}