package Class21;

public class Refresher1 {
    public static void main(String[] args) {

        //creating an array of data type DOG.
        Dog[] dogs ={new Dog("Lal","Black","Persian"),new Dog("Papi","White","Chinese")};
     //   Dog d= dogs[0];
      //  Dog d1=dogs[1];
      //  d.printInfo();
      //  d1.printInfo();
    //    for (int i = 0; i < dogs.length ; i++) { OR
     //       dogs[i].printInfo();
      //  }
        for (Dog d : dogs) {
            d.printInfo();

        }
        }

    }

