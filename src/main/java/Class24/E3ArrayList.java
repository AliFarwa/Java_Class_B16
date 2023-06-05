package Class24;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<Character> characters= new ArrayList<>();
        characters.add('D');
        characters.add('E');
        characters.add('W');
        System.out.println(characters);
        // to print index of
        System.out.println(characters.indexOf('E'));
        // to remove
      //  System.out.println(characters.remove('D'));
        // to see if something is there
      //  System.out.println(characters.contains());
        //To check if there are  or no elements
        System.out.println(characters.isEmpty());
        // replace an element like from E to with new value
        //so you will add the index of the element with what character ypu want to replace
        System.out.println(characters.set(1, 'H'));//replaces E with H
        System.out.println(characters);

    }
}
