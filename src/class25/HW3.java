package class25;

import java.util.ArrayList;

public class HW3 {
    public static void main(String[] args) {
        //Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from
        // that arrayList.

        ArrayList<Integer> evenNum=new ArrayList<>();

        for (int i=2;i<=500;i+=2){
            if(i%5!=0){
                evenNum.add(i);
            }
        }
        System.out.println(evenNum);



    }
}
