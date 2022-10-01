package class13;

import java.util.Arrays;

public class StringDemo1 {
    public static void main(String[] args) {
        String str="Today is Sunday";//want to get only Sunday from string
        String day=str.substring(9);//starts from 9th index onward
        System.out.println(day);//will print "Sunday"
        System.out.println(str.substring(6,8));//starting index 6 & ending 8

        char c=str.charAt(4);//calling the method charAt on str object
        System.out.println(str.charAt(4));//gives single character at that specific index
        System.out.println();

        char[] charArr=str.toCharArray();//converts string to array of chars
        System.out.println(charArr);//will print as string
        System.out.println(Arrays.toString(charArr));//will print as an array

        //find index of a:
        int index=str.indexOf("a");//will find index of a
        System.out.println(index);//will print index as 3
        System.out.println(str.indexOf("a",6));//will give index of the second a
    }
}
