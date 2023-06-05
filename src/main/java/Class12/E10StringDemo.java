package Class12;

public class E10StringDemo {
    public static void main(String[] args) {


        //If we want to extract characters one by one
        String name = "LEANDROR";
        //  System.out.println(name.charAt(1));
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            //to see how many times we print "R"
            if (name.charAt(i) == 'R') {
                counter++;
            }
        }
        System.out.println(counter);

    }
    }

