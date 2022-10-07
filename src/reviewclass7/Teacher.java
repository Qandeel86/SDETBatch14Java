package reviewclass7;

public class Teacher {//see school class for printout

    String name, lastName;
    int experience;
    String subject;
    double salary;

    static String school;

    /*how to create a constructor:
    1.Name of constructor should be same as class name
    2.Constructor doesn't have any return type(not even void)

    **Logic behind constructor is to initialize instance variables and methods will be something
    **  executing an action or printing out something.
     */

    //using below constructor, we initialize instance variables(name, last name)
    Teacher(String fName,String lName){
        name=fName;
        lastName=lName;
    }
    /*When you create a constructor:
    -compiler is not going to create a default constructor for you
     */

    void print(){
        System.out.println(name+" "+lastName);
    }
}
