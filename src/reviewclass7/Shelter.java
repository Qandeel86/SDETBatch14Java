package reviewclass7;

public class Shelter {//INFO TAKEN FROM DOG CLASS

    public static void main(String[] args){
        //accessing static-use class name
        Dog.breed="Huskey";
        Dog dog1=new Dog();
        //how to access the instance variables? through objects
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();

        Dog dog2=new Dog();
        System.out.println(dog2.name);
        dog2.name="Tommy";
        dog2.weight=10;
        dog2.printInfo();

        System.out.println("Making Changes");
        dog1.name="Bobik";
        dog1.breed="german";//even if applied to dog1 object, this change
        //will affect dog2 as well because static variables stay same within all objects

        dog1.printInfo();
        dog2.printInfo();

        double price=dog1.getPrice();
        System.out.println(price);

        float price2=dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        dog1.love("to jump");
        dog2.love("to play");
    }
}
