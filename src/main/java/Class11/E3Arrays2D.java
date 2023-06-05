package Class11;

public class E3Arrays2D {
    public static void main(String[] args) {
        int [][] arr2D={{ 10,20,30,40,50},
                {1,2,3,4,5},//row
                {5,5,5,5,5},// || coloumn
                {10,8,6,4,2}};
// we want to print all the numbers
        for (int[] arr1D : arr2D) {
            for (int num : arr1D){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
// the above is 4 1Darrays.
