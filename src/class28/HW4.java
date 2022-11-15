package class28;

import java.util.TreeMap;

public class HW4 {
        /*Create a Person class with following private fields: name, lastName, age, salary.
          Variables should be initialized through constructor.
          Inside the class also create a method to print user details.
          In Test Class create a Map that will store key in ascending order.
          In that map store personId and a Person Object. Print each object details.
         */
        public static void main(String[] args) {
            TreeMap<String,Person> personDetails=new TreeMap<>();
            personDetails.put("111",new Person("Qandeel","Wasim",36,150000.0));
            personDetails.put("222",new Person("Adnan","Malik",42,250000.0));

            for(var person:personDetails.values()){
                System.out.println(person.printInfo());
            }

        }
}
class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;

    Person(String name,String lastName,int age,double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    String printInfo(){
        return"First name = "+name+" Last name = "+lastName+" Age = "+age+" Salary = "+salary;

    }

}
