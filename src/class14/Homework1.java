package class14;

public class Homework1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void largestNum(int a, int b){
        if(a>b){
            System.out.println(a+" is the largest number");
        }else{
            System.out.println(b+" is the largest number");
        }
    }

    public static void main(String[] args) {
        Homework1 largest=new Homework1();
        largest.largestNum(10,50);
    }




}
