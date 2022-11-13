package repls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");



        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() +
                    " : " + entry.getValue());

        }



        var iterator1 =map.entrySet().iterator();

        while(iterator1.hasNext()){
            var item=iterator1.next();
            var key=item.getKey();
            var value=item.getValue();
            if(item.getValue().equals("BBB")||item.getValue().equals("CCC")||item.getValue().equals("EEE")){

                System.out.println(item.getKey()+" : "+item.getValue());
            }

        }



        }


    }






