package Class9;

public class E8Arrays {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        for (int i = 6; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}
