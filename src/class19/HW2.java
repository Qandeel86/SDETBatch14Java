package class19;

public class HW2 {
    /* Write program to inherit class A that has method printF which is static and call or reuse that method
     into class B
     */
    static void printF(){
        System.out.println("This is being inherited from parent class");
    }
}

class HW2Child extends HW2{
    public static void main(String[] args) {
        HW2Child obj=new HW2Child();
        obj.printF();
    }
}

