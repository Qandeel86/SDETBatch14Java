package class28;

import java.util.HashMap;

public class HW3 {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place item id and item name into it.
        Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet. */
        HashMap<String,String> bestBuy=new HashMap<>();
        bestBuy.put("7664847","Printer");
        bestBuy.put("7879885","TV");
        bestBuy.put("7511344","Laptop");
        //Print all keys and values using entrySet
        var entrySet= bestBuy.entrySet();
        for(var items:entrySet){
            System.out.println(items.getKey()+" "+items.getValue());
        }







    }
}
