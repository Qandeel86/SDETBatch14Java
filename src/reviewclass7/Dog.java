package reviewclass7;

public class Dog {//See Shelter class for printout

    String name;//instance variable
    int weight;//instance variable
    static String breed;//static

    //when we do not create a constructor->
    //compiler creates a default constructor for us

    void printInfo(){
        System.out.println("Dog features:"+name+", "+weight+", "+breed);
    }

    void love(String thing){
        System.out.println(name+" loves "+thing);
    }

    //create a method to return price

    //if weight is more than 5->100
    //if weight is more than 10->300
    //if weight is more than 20->1000
    float getPrice(){
        if(weight>5){
            return 100;
        }else if(weight>10){
            return 200;
        }else{
            return 1000;
        }
    }

    //create a method that will return bark type

    //if weight is more less than 5->loud
    //if weight less than 20 lbs-> noise is woof woof
    //if weight is less than 500->noise gav gav

    String bark(){
        String noise; //introducing variable; this variable is local(inside method)
        if(weight<5){
            noise="loud";
        }else if(weight<10){
            noise="woof woof";
        }else{
            noise="GAV GAV";
        }
        return noise;
    }


    /*variables syntax:
        dataType name
    exp.String breed;

    *method syntax:
        returnType name
    exp.void printInfo

     */
}
