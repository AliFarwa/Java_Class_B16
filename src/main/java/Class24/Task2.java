package Class24;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("orange");
        words.add("grape");
//        for (String word : words) {
//            if(word.endsWith("e")){
//                System.out.println(word);
//            }


////        }\// iterator has 3 methods
//        Iterator<String> iterator= words.iterator();//syntax
//        //this method returns us boolean
//        while ((iterator.hasNext())){// will return boolean true or false
//            String word=iterator.next();//returns actual value
//            if(word.endsWith("e")){
//                iterator.remove();;// returns that value
//            }
//        }
//        System.out.println(words);
        //lamda way:
        words.removeIf(word->word.endsWith("e"));
        System.out.println(words);
    }
}
