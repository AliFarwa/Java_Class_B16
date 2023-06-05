package Class13;
//E10 Method Tester is connected to this class
public class Printer {

    void printSomething() {// this one will only print hello javaa
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");}

        static void printWord(String word) {// you can print anything with this
            System.out.println(word);
            System.out.println(word);
            System.out.println(word);
            System.out.println(word);

        }

        static void printWordManyTimes(String word, int number){// with this you can decide how many times u want to print
            for (int i = 0; i < number; i++) {
                System.out.println(word);
            }
        }


}
