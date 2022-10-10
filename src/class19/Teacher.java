package class19;

public class Teacher {
    /* Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses
     MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
     Test all 4 classes */
    String name;
    String subject;
    int yearsOfExperience;

    public Teacher(String name,String subject,int yearsOfExperience){
        this.name=name;
        this.subject=subject;
        this.yearsOfExperience=yearsOfExperience;
    }
    public void printInfo(){
        System.out.println("This teachers name is "+name+" and the subject they teach is "+subject+" and the number of" +
                " years they have been teaching is "+yearsOfExperience);
    }
}
class MathTeacher extends Teacher{
    int salary=65000;
    MathTeacher(String name,String subject,int yearsOfExperience){
        super(name,subject,yearsOfExperience);
    }
    void printSalary(){
        System.out.println("The math teachers salary is "+salary);
    }
}

class ChemistryTeacher extends Teacher{
    String collegeDegree="Science";
    ChemistryTeacher(String name,String subject,int yearsOfExperience){
        super(name,subject,yearsOfExperience);
    }
    void printDegree(){
        System.out.println("Has a degree in "+collegeDegree);
    }
}

class PianoTeacher extends Teacher{
    int weeklyLessons=5;
    PianoTeacher(String name,String subject,int yearsOfExperience){
        super(name,subject,yearsOfExperience);
    }
    void printLesson(){
        System.out.println("The piano teacher teaches "+weeklyLessons+" times a week");
    }
}

class TestTeacher{
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Qandeel","History",6);
        teacher.printInfo();

        MathTeacher mathTeacher=new MathTeacher("Azeem","Math",4);
        mathTeacher.printInfo();
        mathTeacher.printSalary();

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher("Sandal","Chemistry",2);
        chemistryTeacher.printInfo();
        chemistryTeacher.printDegree();

        PianoTeacher pianoTeacher=new PianoTeacher("Sameer","Piano",10);
        pianoTeacher.printInfo();
        pianoTeacher.printLesson();
    }
}
