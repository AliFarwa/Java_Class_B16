package Review12;

public class E5Methods {
    /*
            create a method that will take an array of ints and will return the sum
            of the elements of the array method should be accessible throughout the project
            and method should be callable by just writing the name of the class.
             */
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        int result= sum(array);
        System.out.println(result);
    }
}
