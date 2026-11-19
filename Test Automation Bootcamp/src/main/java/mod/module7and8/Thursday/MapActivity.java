package mod.module7and8.Thursday;

//Needs to be completed

import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    static void main(String[] args) {

        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map map = new HashMap();
        map.put("List", "ArrayList");
        map.put("Set", "Hashset");
        map.put("Jha", "Amit Kumar");
        map.put("Amit", "Amit Kumar");
        map.put("Shanti", "Amit Kumar");
        map.put("Jha", "Amit Kumar");
        map.put("Amit", "Amit Kumar");
        map.put("Amit", "Kumar");
        map.put("Jha", "Chandan");
        map.put("Amit", "Chandan");
        map.put("Name", "Surname");
        map.put("Map", "Hashmap");

        // 2 - Call print method to print the map passed as its parameter
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)
        MapActivity mapActivity = new MapActivity();
        mapActivity.print(map);
    }

    void print(Map map) {

        // 3 - Type code to print this map (keys and values)
        System.out.println(map);
    }

}