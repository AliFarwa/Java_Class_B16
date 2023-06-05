package Class11;

public class E4Arrays2D {
    public static void main(String[] args) {
        int[][] arr2D = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},//row
                {5, 5, 5, 5, 5},// || coloumn
                {10, 8, 6, 4, 2}};
        int sum = 0;
        for (int[] arr1D : arr2D) {
            for (int numb : arr1D) {
                if (numb % 2 == 0) {
                    sum++;

                }

            }

        }
        System.out.println("sum = " + sum);// soutv will print automatically.

    }
}