package Class26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        //Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        //Check how many entries you have?
        //Update company on a 4th floor
        //Remove company on the 7th floor
        //Print your map

        Map<Integer,String> buildingMap= new LinkedHashMap<>();
        buildingMap.put(1, "Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Microsoft");
        buildingMap.put(4, "Amazon");
        buildingMap.put(5, "Youtube");
        buildingMap.put(6, "Apple");
        buildingMap.put(7, "Tesla");


        System.out.println(buildingMap.size());
        System.out.println(buildingMap);
        buildingMap.replace(4, "Facebook");
        System.out.println(buildingMap);
        buildingMap.remove(7);
        System.out.println(buildingMap);
        System.out.println(buildingMap);



    }
}
