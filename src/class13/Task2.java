package class13;

public class Task2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        //Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str="aejerJAJHSJ%*#@@@%&&&5656456***sjdnMKNK";
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
        String str2= str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(str2.length());
    }
}
