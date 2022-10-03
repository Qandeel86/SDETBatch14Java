package class14;

public class Homework4 {
    //Create a method that will say Hello in different language based on the country that will passed when method
    // is executed
    void sayHello(String country) {
        if (country.equalsIgnoreCase("Pakistan")) {
            System.out.println("Salaam");
        } else if (country.equalsIgnoreCase("China")) {
            System.out.println("Nǐ hǎo");
        } else if (country.equalsIgnoreCase("Mexico")) {
            System.out.println("Hola");
        }
    }

    public static void main(String[] args) {
        Homework4 greeting=new Homework4();
        greeting.sayHello("Pakistan");
        greeting.sayHello("China");
        greeting.sayHello("Mexico");
    }
}
