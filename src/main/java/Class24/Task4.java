package Class24;



import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
//        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("coffee");
        drinks.add("water");
        drinks.add("Juice");

        for (int i = 0; i < drinks.size(); i++) {
            String word = drinks.get(i);//first get all elements from array list
            if (word.contains("e") || word.contains("a")) {// then check which contains a and e and replace with water
                drinks.set(i, "Water");// all a and e will be replaced with water
            }
        }
        System.out.println(drinks);

        //OR
        drinks.replaceAll(x->x.contains("a")||x.contains ("e")? "Water": x);
        System.out.println(drinks);// this is lamda way
    }
}