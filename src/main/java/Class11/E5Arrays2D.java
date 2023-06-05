package Class11;

public class E5Arrays2D {
    public static void main(String[] args) {
        // with the help of loop you have to add all elements
        //for each row and print their sum

        int[][] arr2D = {{10, 20, 30, 40, 50},//150
                {1, 2, 3, 4, 5},//15
                {5, 5, 5, 5, 5},//25
                {10, 8, 6, 4, 2}};//30

        int sum = 0;
        for (int[] arr1D : arr2D) {
            sum=0;// this will print seperate sum for sperate lines.
            for (int numb : arr1D) {
                sum = sum + numb;

            }
           System.out.println(sum);
            //sum=0;// this line will
        }

    }
}
