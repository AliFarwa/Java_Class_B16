package Class9;

public class E4Arrays {
    public static void main(String[] args) {
        String[] names = {"Farwa", "Dania", "Kabeer", "Ali", "Syed"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i < names.length)
        {
            System.out.print(names[i]+" ");
            i++;
        }
    }
}