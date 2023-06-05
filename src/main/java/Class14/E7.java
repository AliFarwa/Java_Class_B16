package Class14;

public class E7 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger

    void isLargest(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
    public static void main(String[] args) {
        E7 obj = new E7();
        obj.isLargest(10, 20);
    }
}

//Other way:

/*   int num(int a, int b){

        if (a>b){
           return a;
        }
        return b;
    }
    public static void main(String[] args) {
        HW1 obj=new HW1();
        System.out.println(obj.num(10,20));
    }
    }*/