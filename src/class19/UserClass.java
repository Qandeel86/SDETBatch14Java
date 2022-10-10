package class19;

public class UserClass {
    /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through
     constructor call. Print users name, mobile number and address in userDetails method. Test your code.*/

    String name;
    String mobileNumber;

    UserClass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}

class UserInfo extends UserClass{
    String userAddress="1234 Fifth Avenue";

    UserInfo(String name,String mobileNumber){
        super(name,mobileNumber);
    }
    void printInfo(){
        System.out.println("Name: "+name+" Mobile #: "+mobileNumber);
        System.out.println("Address is: "+userAddress);
    }
    }


class UserDetails{
    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("Qandeel","703-111-2222");
        userInfo.printInfo();
    }
}
