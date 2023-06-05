package Class14;

public class E6 {
    //create a method which returns true and false and takes an int number
    //as a parameter if number is
    //even it return true otherwise it returns false.


    boolean isEven(int num){
        boolean found=true;
        if(num%2==0){
            found=true;
        }
        return found;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        int num=10;
        boolean result= obj.isEven(num);
        System.out.println(result);
    }
}
