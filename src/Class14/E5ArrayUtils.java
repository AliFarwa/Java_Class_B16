package Class14;

public class E5ArrayUtils {
    /* Create a method call it contains it should take an array of int and an int number in the method
    body it should seacrh the array for that number if number is present in the array method should return true
    otherwise method should return false and in a seperate class call the method and test it for below input{10,20,45}
    number20
     */

    boolean contains(int[] array, int num) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}