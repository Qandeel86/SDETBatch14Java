package class13;

public class Task1 {
    public static void main(String[] args) {
        //1. Create a String that will hold a sentence. Write a program to get a new String
        //without any spaces.

        String str="I am turning 36 this November";
        System.out.println(str.replaceAll(" ",""));
    }
}
