package class20;

public class HW4 {
    /*Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method
    with specific arguments and observe result.
     */

    private void Add(int num1,int num2){
        System.out.println(num1+num2);
    }
    private void Add(double num1,double num2){
        System.out.println(num1+num2);
    }
    private void Add(int num1,double num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        HW4 obj=new HW4();
        obj.Add(2,5);
        obj.Add(6,5.5);
        obj.Add(6.5,2.9);
    }
}
