package Class12;

public class Task2 {
    public static void main(String[] args) {
        //print code of all index a

        String name="Today is Saturday";
        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i)=='a'){
                System.out.println(i);

                //to print all 'a':
               // System.out.println(name.charAt(i));
            }

        }

    }
}
