package Class26;

import java.util.HashSet;
import java.util.Set;

public class EntrySetTester {
    public static void main(String[] args) {
       HashSet<Entry> entrySet=new HashSet<>();
        entrySet.add(new Entry("Coke",2.0));
        entrySet.add(new Entry("Milk",5.0));
        entrySet.add(new Entry("Mango juice",2.5));

        //for (Entry entry : entrySet) {
          //  System.out.println(entry.getKey());//print drinks
           // System.out.println(entry.getvalue());//print value
          //  if(entry.getKey().contains("i") && entry.getvalue()>2){
           //     System.out.println(entry.getKey()+" "+entry.getvalue());
            entrySet.removeIf(x->x.getKey().contains("i")&& x.getvalue()>2);
                System.out.println(entrySet);
            }
        }
  //  }

