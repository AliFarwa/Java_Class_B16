package Class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is It Time For Break true/false");
        boolean isbreak= scanner.nextBoolean();
        if(isbreak)
            System.out.println("Lets have a break");
    }
}
