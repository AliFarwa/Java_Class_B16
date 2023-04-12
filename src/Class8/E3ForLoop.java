package Class8;

public class E3ForLoop {
    public static void main(String[] args) {
        //Write a loop to add all the even numbers from 1 to 30.

        int numb = 1;
        int sum = 0;
       for (numb=1 ; numb<=30; numb++)
           if(numb%2==0)
            sum = sum + numb;
        {
            System.out.println(sum);
        }
    }
}
