package class25;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLiner");
        makeUpItem.add("Lipstick");


        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Base");
        itemsToBeRemoved.add("Concealer");

        makeUpItem.removeAll(itemsToBeRemoved);
            //makeUpItem.clear(); //use only if you want quick promotion :)
        System.out.println(makeUpItem);
    }
}
