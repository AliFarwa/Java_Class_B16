package Class10;

public class E2Arrays2D {
    public static void main(String[] args) {

        int[][] matrix= new int [3][3];// index will be 0/1/2. Index is always -1.
        matrix[0][0]=10;
        matrix[1][1]=20;
        matrix[2][2]=50;

        System.out.println(matrix[1][2]);
        System.out.println(matrix[2][1]);

    }
}
