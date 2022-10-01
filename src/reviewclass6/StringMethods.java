package reviewclass6;

public class StringMethods {
    public static void main(String[] args) {
        String str="hello";
        //toUpperCase or toLowerCase
        str.toUpperCase();
        System.out.println(str);//hello

        System.out.println("------------");

        str=str.toUpperCase();
        System.out.println(str);//HELLO

        //length() -> Returns the length of this string
        int size=str.length();
        System.out.println(size);

        //charAt() -> Returns the char value at the specified index
        char letter=str.charAt(4);
        System.out.println(letter);

        //how to get last Character
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);//0

        //indexOf- Returns the index within this string of the first occurrence of the specified character
        int index=str.indexOf(lastCharacter);
        System.out.println(index);//4

        System.out.println(str.indexOf('a')); //-1

        //isEmpty()- Returns true if length is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);

    }
}
