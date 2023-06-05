package Class25;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        // Then remove any city that starts with “A”;
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Richmond");
        cities.add("Austin");
        cities.add("Bristow");
        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);

      //  XSSFWorkbook xssfWorkbook;
    }
}
