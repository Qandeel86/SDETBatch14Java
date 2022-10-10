package class19;

public class Shape {
    /*Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     A=πr2
     */
    double radius;

    Shape(double radius){
        this.radius=radius;
    }
}

class Circle extends Shape{
    double pi=3.14;
    double radius1=radius*radius;
    double total=pi*radius1;

    Circle(double radius) {
        super(radius);
    }
   void printArea(){
       System.out.println("The area of the circle is approximately "+total);
   }
}
class ShapeTest{
    public static void main(String[] args) {
        Circle circle=new Circle(4);
        circle.printArea();
    }
}