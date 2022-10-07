package class17;

public class HW1 {
    /*Write a java class that will have a constructor: one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    private String type;
    private String name;
    private String color;

    public HW1(){

    }

    public HW1(String animalType,String animalName,String animalColor){
        type=animalType;
        name=animalName;
        color=animalColor;
    }
    public void printInfo(){
        System.out.println("The "+type+" name is "+name+" and its color is "+color);
    }

}
