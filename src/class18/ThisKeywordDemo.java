package class18;

public class ThisKeywordDemo {
    String str="Red";

    void print(){
        String str="Blue";
        System.out.println(str);//output will be blue
        System.out.println(this.str);//output will be red
    }

    public static void main(String[] args) {
        new ThisKeywordDemo().print();
    }
}
