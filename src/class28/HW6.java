package class28;

import java.util.LinkedList;

public class HW6 {
    public static void main(String[] args) {
        /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
          Write a logic to concatenate all string from the collection.
        */
        LinkedList<String> objects=new LinkedList<>();
        objects.add("Q");
        objects.add("A");
        objects.add("N");
        objects.add("D");
        objects.add("E");
        objects.add("E");
        objects.add("L");

        String word ="";

        for(var object:objects){
            word+=object;

        }System.out.println(word);




    }
}
