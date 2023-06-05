package Class10;

public class E4Arrays2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},//0 index
                {20, 50, 65},// 1 index
                {102, 54, 60}
        };
        for (int j = 0; j < 3; j++) {// we can replace number 3 with matrix.length
            //as they both mean number of rows.
            int[] arr1 = matrix[j];
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }
    }
}