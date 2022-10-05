package class16;

public class Homework2 {
    /*Create a method that will take a String as a parameter and returns reversed String. Method should be available
    to all classes within your project and accessible by class name.
     */
    public String str(String word){
        String str1="";
        for(int i=word.length()-1;i>=0;i--){
        str1=str1+word.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args){
        Homework2 obj=new Homework2();
        System.out.println(obj.str("people"));
    }
}