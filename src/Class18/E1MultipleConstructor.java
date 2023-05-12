package Class18;

public class E1MultipleConstructor {
    public static void main(String[] args) {

        String str = new String("Java");
        char[] chars = {'J', 'a', 'v', 'a'};
        chars = str.toCharArray();
        String str1 = new String(chars);
        //extract java and convert it to all upper case
        char[] chars2 = {'t', 'h', 'e', 'J', 'a', 'v', 'a', 'I', 'V', 'A'};
        String str3 = new String(chars2, 3, 4);
        System.out.println(str3.toUpperCase());
    }
}
