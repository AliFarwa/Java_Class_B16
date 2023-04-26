package Class13;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889,};
        int number = 100;
        int number1 = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number && arr[i] == number1) {
                System.out.println("Number 100  is there");
            } else {
                System.out.println("Number 100  is not there");
                break;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == number1) {
                System.out.println("Number 10 is there");
            } else {
                System.out.println("Number 10 is not there");
                break;
            }
        }
    }
}
