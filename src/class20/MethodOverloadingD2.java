package class20;

public class MethodOverloadingD2 {
    void F1(String name,int number){
        System.out.println(name+" "+number);
    }
    //Overloading by changing the number of parameters
    void F1(String name,int number,int number2){
        System.out.println(name+" "+number);
    }
    //Overloading by changing the data type
    void F1(int num1,int number){
        System.out.println(num1+" "+number);
    }

    void F1(int number,String name){
        System.out.println(number+" "+name);
    }

    public static void main(String[] args) {
        MethodOverloadingD2 md=new MethodOverloadingD2();
        md.F1("Taras",20);
    }
}
