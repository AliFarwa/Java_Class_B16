package Class9;

public class E5Arrays {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++)
            if (i % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        System.out.println();

        char[] chars={'A','B','C','D','E'};
        for (int i=0; i<chars.length ;i+=2){
            System.out.print(chars[i]+" ");
        }


    }

}
