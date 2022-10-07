package reviewclass7;

public class School {//refer to teacher class

    public static void main(String[] args) {

        Teacher t1=new Teacher("Asghar","Nazir");//<-object got created with 2 parameters
        t1.print();

        Teacher t2=new Teacher("Moazzam","Sadiq");
        t2.print();
    }
}
