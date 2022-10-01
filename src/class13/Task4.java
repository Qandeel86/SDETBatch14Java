package class13;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        String str="This is sentence I want to reverse";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i)+" ");

        }
    }
}
