package Class7;

public class E11Whileloops {
    public static void main(String[] args) {
        int numbers = 100;
        System.out.println();
        while (numbers > 0) {
            System.out.print(numbers);
            numbers--;
            System.out.println();
            if (numbers % 2 == 0) {
                System.out.print(" " + numbers + " ");
            }
            System.out.println();
            if (numbers % 2 != 0) {
                System.out.print(" " + numbers + " ");
            }

        }
    }
}