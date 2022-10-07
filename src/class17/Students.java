package class17;

public class Students {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your
    class also have a method to Calculate Average Grade. Test Student class for 5 different students with different
    marks. Your program should print an average mark of each student's name.
    NOTE: please use different names for instance and local variables.
      */
    String name;
    int sub1;
    int sub2;
    int sub3;

    Students(String fName,int score1,int score2,int score3){
        name=fName;
        sub1=score1;
        sub2=score2;
        sub3=score3;
    }

    void calcAverage(){
        int averageMark=(sub1+sub2+sub3)/3;
        System.out.println(name+" has an average mark of "+averageMark);
    }
}
