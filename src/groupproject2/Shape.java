package groupproject2;

public interface Shape {
    /*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter. Create 2 classes
    Circle & Square that implements functionality defined in the Shape Interface. Test your code.*/

    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape{
    double radius;
    Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * radius * radius);

    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2 * Math.PI * radius);
    }
}

class Square implements Shape{
    double side;

    Square(double side){
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side*side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(side*4);
    }
}

class shapeTester{
    public static void main(String[] args) {

    Circle circle=new Circle(4);
    circle.calculateArea();
    circle.calculatePerimeter();

    Square square=new Square(6);
    square.calculateArea();
    square.calculatePerimeter();
    }
}

