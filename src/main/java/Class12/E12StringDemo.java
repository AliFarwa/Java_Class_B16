package Class12;

public class E12StringDemo {
    public static void main(String[] args) {
        //This will print whatever is after index 4
        //substring is used get a part of the complete string
        String sentence="Yup we have another class";
        System.out.println(sentence.substring(4,11));  // 10-1=11


        int startIndex= sentence.length()-4;
        System.out.println(sentence.substring(startIndex));


    }
}
