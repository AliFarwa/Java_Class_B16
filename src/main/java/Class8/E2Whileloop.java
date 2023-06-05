package Class8;

import java.util.Scanner;

public class E2Whileloop {
    public static void main(String[] args) {
// in a while lop ask the user to enter numbers if user enters any number
        // other than -1 print "Try Again"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int numb = scanner.nextInt();

        while (numb != -1) {
            System.out.println("Try Again");
            numb = scanner.nextInt();
        }
    }
}