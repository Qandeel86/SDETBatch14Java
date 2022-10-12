package class20;

public class HW3 {
    /*Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with
    specific arguments and observe result.
     */

    static void Test(String name,int number){
        System.out.println(name+" "+number);
    }

    static void Test(String name,int number,int number2){
        System.out.println(name+" "+number);
    }

    static void Test(int num1,int number){
        System.out.println(num1+" "+number);
    }

    public static void main(String[] args) {
        HW3.Test("Qandeel",35);
        HW3.Test("Qandeel",4,7);
        HW3.Test(45,31);

    }
}
