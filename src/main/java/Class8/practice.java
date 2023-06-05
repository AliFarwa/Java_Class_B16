package Class8;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //to print all the numbers from a starting point to an ending point and step
        //ask the user for starting and ending number

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is ths starting and ending point?");
        int starting = scanner.nextInt();
        int ending = scanner.nextInt();

        while (starting <= ending) {
            System.out.println(starting + " ");
            starting++;
        }
    }
}
