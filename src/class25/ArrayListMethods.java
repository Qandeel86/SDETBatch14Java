package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLiner");
        makeUpItem.add("Lipstick");

        ArrayList<String> cosmetics= new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        ArrayList<String> beautyProducts=new ArrayList<>();
        //adds everything from makeUpItem to beautyProducts
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);

        beautyProducts.remove("Lotion");//will remove an element from array
        System.out.println(beautyProducts);

        beautyProducts.removeAll(cosmetics);//will remove all elements from cosmetics array
        System.out.println(beautyProducts);

        beautyProducts.clear();//this will remove EVERYTHING, and we will get an empty array
        System.out.println(beautyProducts);

    }
}
