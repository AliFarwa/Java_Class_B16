package Class9;

public class E7Arrays {
    public static void main(String[] args) {
        int counter=0;
        boolean []flags={true,false,true,false,false,true};
        for (int i=0; i < flags.length; i++)
            if(flags[i]==false)
                counter++;
            System.out.print(counter);

    }
}
