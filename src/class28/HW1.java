package class28;

import java.util.HashMap;

public class HW1 {
    public static void main(String[] args) {
        /* Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map */

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Google");
        map.put(2,"Syntax");
        map.put(3,"Amazon");
        map.put(4,"Apple");
        map.put(5,"Ebay");
        map.put(1,"Google");
        map.put(7,"Syntax");

        //how many entries are there in the map
        int entries= map.size();
        System.out.println("The number of entries is : "+entries);

        //update company on 4th floor
        map.replace(4, "Walmart");

        //remove company on 7th floor
        map.remove(7);

        //print map
        System.out.println(map);



    }
}
