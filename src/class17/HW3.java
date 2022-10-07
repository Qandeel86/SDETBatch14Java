package class17;

public class HW3 {
    /*Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package  and observe result.
    */
    //
    public String employeeName;
    public int yearsWorked;
    private int salary;

    HW3(){

    }

    private HW3(int pay){
        salary=pay;
    }
    public HW3(String fName,int years){
        employeeName=fName;
        yearsWorked=years;

    }
    private void getSalary(){
        System.out.println("The salary of "+employeeName+" is "+salary);
    }
    public void employeeInfo(){
        System.out.println("The employees name is "+employeeName+" and they have worked for "+yearsWorked);
    }

    public static void main(String[] args) {
        HW3 obj1=new HW3(100000);
        obj1.getSalary();
        HW3 obj2=new HW3(150000);
        obj2.getSalary();
        HW3 obj3=new HW3(200000);
        obj3.getSalary();
        HW3 obj4=new HW3(250000);
        obj4.getSalary();
    }
}
