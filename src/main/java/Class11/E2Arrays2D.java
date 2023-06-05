package Class11;

public class E2Arrays2D {
    public static void main(String[] args) {
//Print all the elements.
        String[][] names = {{"Sarah", "Artem", "Lean", "Semir"},
                               {"Farwa", "Halima", "Alina", "Semir"},};

       for (int j = 0; j < names.length; j++) {
           for (int i = 0; i <names[j].length; i++) {
              System.out.print(names[j][i] + " ");
            }
           System.out.println();
        }
        }
    }