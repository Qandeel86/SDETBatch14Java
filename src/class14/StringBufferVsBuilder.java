package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
            //Mostly used class; newer, better, faster(is not thread safe)
        StringBuilder stringBuilder=new StringBuilder("Today is java class");
            //older one; slow and not used mostly(it is thread safe)
        StringBuffer stringBuffer=new StringBuffer("Today is java class");

        String str="Java is very easy";
        /*
        If we want to convert the String to a StringBuilder we can use the below syntax
         */
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);
        /*
        If we want to convert from StringBuilder to a String we can use the below syntax
         */
        String newStr=stringBuilder1.toString();//will convert string builder to string
    }
}
