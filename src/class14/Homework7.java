package class14;

import java.util.Scanner;

public class Homework7 {
    //Create  class Student that will have a method getGrade. Your method should accept the score of a student
    // and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F

    void getGrade(int numGrade){
        if(numGrade>90){
            System.out.println("Your grade is A");
        }else if(numGrade>80){
            System.out.println("Your grade is B");
        }else if(numGrade>70){
            System.out.println("Your grade is C");
        }else if(numGrade>50){
            System.out.println("Your grade is D");
        }else{
            System.out.println("Your grade is F");
        }
    }

    public static void main(String[] args) {
        Homework7 student1=new Homework7();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your score number");
        int numGrade= input.nextInt();
        student1.getGrade(numGrade);
    }
}


