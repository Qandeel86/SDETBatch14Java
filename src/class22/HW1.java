package class22;

public class HW1 {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism */
}

class Student{
    void study(){
        System.out.println("I have to study");
    }
    void doHomework(){
        System.out.println("I need to complete my homework");
    }
    void attendClass(){
        System.out.println("I have to attend my classes");
    }
}

class SyntaxStudent extends Student{
    void study(){
        System.out.println("I have to study Java and how to code");
    }
    void doHomework(){
        System.out.println("I have to complete my coding assignments on time");
    }
    void doRepls(){
        System.out.println("I have to complete repls by the due date");
    }
}

class CollegeStudent extends Student{
    void study(){
        System.out.println("I have to study different subjects");
    }
    void doHomework(){
        System.out.println("I have to write papers for my homework");
    }
    void chooseMajor(){
        System.out.println("I get to choose my major to get a degree in");
    }
}

class SchoolStudent extends Student{
    void study(){
        System.out.println("I have to study for my SATs");
    }
    void doHomework(){
        System.out.println("I have to complete homework for different subjects");
    }
}

class StudentTester{
    public static void main(String[] args) {
        Student[]student= {new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
            for(Student student1:student){
                student1.study();
                student1.doHomework();
                student1.attendClass();
            }
    }

}