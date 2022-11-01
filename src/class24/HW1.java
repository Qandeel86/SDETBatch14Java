package class24;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {
        /*Create an ArrayList that will store 5 names into it. Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Qandeel");
        names.add("Azeem");
        names.add("Sandal");
        names.add("Sameer");
        names.add("Wasim");

        if (names.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        System.out.println(names.contains("Sameer"));

        System.out.println(names.size());
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}