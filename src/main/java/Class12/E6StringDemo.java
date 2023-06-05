package Class12;

public class E6StringDemo {
    public static void main(String[] args) {

        String name="Justine";
        System.out.println(name.equals("Axel"));// name does not match above result false
        System.out.println(name.equals("Justine"));//name exactly as above result true
        System.out.println(name.equalsIgnoreCase("JUSTINE"));// it has ignorecase so result is true
        System.out.println(!name.equalsIgnoreCase("JUSTINE"));//since it has ! it will return false
    }
}
