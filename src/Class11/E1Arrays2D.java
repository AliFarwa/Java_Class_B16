package Class11;

public class E1Arrays2D {
    public static void main(String[] args) {


        //What are 2D arrays?
        // 2D arrays are collection of, 1D arrays

           int [][] arr={{ 10,20,30,40,50},
                   {1,2,3,4,5},//row
                   {5,5,5,5,5},// || coloumn
                   {10,8,6,4,2},
                   //prin only odd numbers from 2D arrays
           };
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] % 2 != 0)
                    System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
    }
}