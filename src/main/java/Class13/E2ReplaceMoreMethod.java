package Class13;

public class E2ReplaceMoreMethod {
    public static void main(String[] args) {

        String str= "nhaknjSFuSDF45463@#$%&";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[0-9]","%"));
        System.out.println(str.replaceAll("[a-z0-9]","%"));
        System.out.println(str.replaceAll("[a-z0A-Z]","%"));
        System.out.println(str.replaceAll("[a-v]","*"));

    }
}
