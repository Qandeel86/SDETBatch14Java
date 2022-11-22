package repls;

import java.util.HashMap;

public class Main {

    static void display(HashMap<String,Integer> map){
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            var entrySet=map.entrySet();
            for(var item:entrySet){
                System.out.println(item.getKey()+" : "+item.getValue());
            }
        }
    }

    public static void main(String[] args) {
        /*
        **NOW IN MAIN METHOD**
        Create HashMap of String keys and Integer values, add values as below

                call above method with these arguments.
                then clear the map.
                and call above method again */
        HashMap<String,Integer> map=new HashMap<>();
        map.put("mango",10);
        map.put("apple",30);
        map.put("orange",20);
        display(map);

        map.clear();

        display(map);









        }

        }







