package Class16;

public class Task1 {
    int createArray (int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum + arr[i];
        }
        return sum;
    }

   public static void main(String[] args) {
        Task1 obj=new Task1();
        int result= obj.createArray(new int[]{10,20,10});
       System.out.println(result);
    }

}
