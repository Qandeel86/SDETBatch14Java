package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words=new ArrayList<>();
        words.add("Table");
        words.add("Chair");
        words.add("Lamp");
        words.add("Picture Frame");

        Iterator<String> iterator=words.iterator();

        while(iterator.hasNext()){
            String item=iterator.next();
            if(item.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);

    }
}
