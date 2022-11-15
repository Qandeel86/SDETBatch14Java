package class28;

import java.util.TreeMap;

public class HW2 {
    public static void main(String[] args) {
        /*Create a map of countries with its capital that will store countries in alphabetical order.
          Print all keys and values from a country map using for each loop and iterator.
          Print all values from a country map using for each loop and iterator.
        */
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Pakistan","Islamabad");
        countries.put("Austria","Vienna");
        countries.put("China","Beijing");
        countries.put("Greece","Athens");
        //Print all keys and values using for each loop
        var entrySet= countries.entrySet();
        for(var country:entrySet){
            System.out.println(country.getKey()+" "+country.getValue());
        }
        //Print all keys and values using iterator
        var iterator =countries.entrySet().iterator();
        while(iterator.hasNext()){
            var country=iterator.next();
            var key=country.getKey();
            var value=country.getValue();
            System.out.println(country);
        }
        //Print all values using for each loop
        var values=countries.values();
        for(var country:values){
            System.out.println(country);
        }
        //Print all values using iterator
        var iterator1=countries.values().iterator();
        while(iterator1.hasNext()){
            var value=iterator1.next();
            System.out.println(value);
        }


    }
}
