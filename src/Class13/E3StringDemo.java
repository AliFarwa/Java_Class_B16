package Class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="ksnfksnDSKJDSDJ1232344@#$%^&*";
        System.out.println(str.replaceAll("[a-z]", ""));//this way lower case will b removedD
        System.out.println(str.replaceAll("[^a-z]", ""));//^this works as not(!)
        System.out.println(str.replaceAll("[^a-z0-9]", ""));//^this works as not(!)
        System.out.println(str.replaceAll("[^a-z0-9A-Z]", ""));//^this works as not(!)
        System.out.println(str.replaceAll("[A-Z]",  "\\$"));//$ only works with \\
    }
}
