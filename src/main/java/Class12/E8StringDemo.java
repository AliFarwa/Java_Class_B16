package Class12;

public class E8StringDemo {
    public static void main(String[] args) {
        //to search data within the strings

        String sentence="Java is very very easy";
        System.out.println(sentence.startsWith("Java"));
        System.out.println(sentence.startsWith("Python"));



        //Method Changing . This method will ignore spaces and convert to lower
        String sentence1="    JAVA is very very easy";
        sentence1=sentence1.trim().toLowerCase();
        System.out.println(sentence1);


    }
}
