package class18;

public class Car {
    //This common class has many names(Parent class,Super class, or Base class)

    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    // if a field or method has private access modifier in parent class, child classes can't use it
    private String engineType;


    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }
}
class BMW extends Car{
    //Child class or derived class
    double engineCC;

}
class Tesla extends Car{

}
class Toyota extends Car{
    double engineCC;
}
class CarTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="x8";
        bmw.printCarDetails();
    }
}