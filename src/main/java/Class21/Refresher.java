package Class21;

public class Refresher {
    public static void main(String[] args) {
        int[] arr={10,20,30};
     for (int i = 0; i < arr.length ; i++) {
         System.out.println(arr[i]);
         // OR
         //   for (int num : arr) {
           // System.out.println(num);

            }
        System.out.println();

     String [] name={"Vlad","Marina","Veronica"};
     // OR String[] name={new String ("Vlad"),"Marina","Veronica"};
        for (String s : name) {
            System.out.println(s.length());
        }

        Dog dog1=new Dog("Lal","Black","Persian");
        Dog[] dogs={dog1, new Dog("Papi","White","Chinese")};
      for (Dog dog : dogs) {
        dog.printInfo();
       }


        }

        }



