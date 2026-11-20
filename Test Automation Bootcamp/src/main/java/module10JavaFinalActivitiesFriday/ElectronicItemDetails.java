
package module10JavaFinalActivitiesFriday;

import java.util.HashMap;

public class ElectronicItemDetails {

    //returns the price of an electronic item.
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {

        return itemHashMap.get(name);
    }

    static void main(String[] args) {

        // create itemHashMap
        HashMap<String, Double> itemHashMap = new HashMap<>();

        // add 4 electronic items with their prices
        itemHashMap.put("TV", 250.00);
        itemHashMap.put("Refrigerator", 880.00);
        itemHashMap.put("Washing Machine", 660.00);
        itemHashMap.put("Laptop", 2000.00);

        // create object
        ElectronicItemDetails item = new ElectronicItemDetails();

        // print price of TV
        System.out.println("Price of TV is " + item.returnPriceOfItem(itemHashMap, "TV"));
    }
}
