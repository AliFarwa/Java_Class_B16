package Class11;

public class practice {
    public static void main(String[] args) {
//Write a program that sums all numbers that are on even index and on even row.

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
               {1,-2,3,-4}
        };
        int sum=0;
        for (int i = 2; i < a.length ; i++) {
            for (int j = 2; j < a[i].length ; j++) {
                sum+= a[i][j];
            }
        }
       System.out.println(sum);
    }
}
