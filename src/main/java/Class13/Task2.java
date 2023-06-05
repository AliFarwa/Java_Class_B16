package Class13;

public class Task2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

    String str="ABCdef1234%#&*";
    String str1=str.replaceAll("[^a-z-A-Z0-9]", "");
        System.out.println(str1);
        System.out.println(str1.length());



    }
}
