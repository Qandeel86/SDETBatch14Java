package class28;

import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",20.4);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        //Want to remove the items if their price is more than 10

        items.values().removeIf(price -> price > 10);



        //first we are getting a collection of values then an iterator

        /*Iterator<Double> iterator=items.values().iterator();//first we are getting a collection of values then an iterator

        while(iterator.hasNext()){
            Double price=iterator.next();
            if (price>10){
                iterator.remove();
            }
        }*/
        System.out.println(items);




    }
}
