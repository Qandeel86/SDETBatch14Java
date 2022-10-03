package class14;

import java.util.Scanner;

public class Homework2 {
    //Create a method that will take a number and prints whether the number is even or odd.

    boolean even(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Homework2 evenOrOdd=new Homework2();
        System.out.println("Please enter any number");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();

        if(evenOrOdd.even(num)){
            System.out.println(num+" is an even number");
        }else{
            System.out.println(num+" is an odd number");
        }





    }

}
