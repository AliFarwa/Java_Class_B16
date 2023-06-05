package Class15;

public class E3 {

    // create a method that takes an array as input. It adds all the numbers
    // from the array and returns the sum. name of the method should be sumArr


    int  sumArr (int []array){
        int sum=0;
        for (int i=0; i<array.length;i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        E3 obj=new E3();
      //  int[] array={10,20,10};
       // int result= obj.sumArr(array);
       // System.out.println(result);

        int sum= obj.sumArr(new int[]{10,20,10});
        System.out.println(sum);
    }

}

