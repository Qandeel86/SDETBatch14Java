package class14;

import java.util.Scanner;

public class Homework3 {
    //Create a method that will print whether given String is palindrome or not.

    boolean isPalindrome(String word){
        StringBuilder newWord=new StringBuilder(word);
        newWord.reverse();
        if(newWord.toString().equals(word)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Homework3 givenWord=new Homework3();
        System.out.println("Please enter any word");
        Scanner input=new Scanner(System.in);
        String word= input.next();
        if(givenWord.isPalindrome(word)){
            System.out.println(word+" is a palindrome");
        }else{
            System.out.println(word+" is not a palindrome");
        }
    }
}
