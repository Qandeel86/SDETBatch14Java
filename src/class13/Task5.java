package class13;

public class Task5 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true Abbc =>false
        String myString = "aba";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }
    }
}
