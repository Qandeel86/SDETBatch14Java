package class16;

public class Homework3 {
    /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name.
    */
    private String vowel(String word){
        return word.replaceAll("[^aieou]","");
    }
    public static void main(String[] args){
        Homework3 obj=new Homework3();
        System.out.println(obj.vowel("telescope"));
    }
}
