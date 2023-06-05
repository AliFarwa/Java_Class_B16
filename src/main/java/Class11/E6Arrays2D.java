package Class11;

public class E6Arrays2D {
    public static void main(String[] args) {

        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false},

        };
        int sum = 0;
        for (boolean[] words : arr2D) {
            for (boolean word : words) {
                if (word == true)
                sum++;{
                }
            }
        }
        System.out.println(sum);
    }
}
