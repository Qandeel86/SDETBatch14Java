package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Soda");
        drinks.add("Tea");
        drinks.add("Lemonade");
        drinks.add("Juice");

        Iterator<String> iterator=drinks.iterator();

        while(iterator.hasNext()){
            String item=iterator.next();
            if(item.contains("e")||item.contains("a")){
                System.out.println("water");
            }else{
                System.out.println(item);
            }
        }




    }
}

