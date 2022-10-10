package repls;

public class Main {
    /*Create a static method with the following specs:
Returns: an integer
Name: countA
Parameters: a String called s
Purpose:count the number of occurrences of 'a' or 'A' within s
Examples:
countA("aaa") ==> 3
countA("aaBBdf8k3AAadnklA") ==> 6
*/
//test case below (dont change):
    static int countA(String s){
    String str=s.replaceAll("[^aA]","");


        return str.length();
    }



    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}

