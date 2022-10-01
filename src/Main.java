public class Main {
    public static void main(String[] args) {
        /*
        String does not allow any methods to change the original contents of the variables
        because String is immutable
        */
        StringBuilder stringBuilder=new StringBuilder("Intellij is great");
         System.out.println(stringBuilder);
         stringBuilder.reverse();
         System.out.println(stringBuilder);
         /*
         String does not allow any methods to change the original contents of the variables
         because String is immutable
          */
         String str=" Intellij ";
         str.toLowerCase();
         System.out.println(str);

        /*String country="USA";(This will give same memory location)
        String home="USA";
        StringBuilder state=new StringBuilder("New York");(this will give diff memory location)
        StringBuilder state2=new StringBuilder("New York");*/


    }
}