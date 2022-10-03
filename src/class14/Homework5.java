package class14;

public class Homework5 {
    //Create a method createEmail(). Based on values of users name, lastName and email type, your method should
    // return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com


    String createEmail(String firstName, String lastName,String emailType){

        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        Homework5 emailAddress=new Homework5();
        System.out.println(emailAddress.createEmail("qandeel","wasim","gmail"));
    }
}
