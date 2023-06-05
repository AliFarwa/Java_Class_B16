package Class14;

import Class13.ArrayUtil;

public class E4ArrayUtils {
/* creata a method to add two int numbers and it should return the results back when called
name of the method should be add
return type= int
name of method== add
parameter==(int a,int b)
 */

    int add( int a , int b){
        int sum= a+b;

        return sum;


    }

    public static void main(String[] args) {

        E4ArrayUtils obj = new E4ArrayUtils();
       int sum= obj. add(10,20);
        System.out.println(sum); //OR
       // System.out.println(obj. add(10,20));



    }




}