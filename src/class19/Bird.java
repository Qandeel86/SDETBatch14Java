package class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;
    Bird(String name,String color,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }

void printInfo(){
    System.out.println("Name "+name+" Color "+color+" Age "+age+" Weight "+weight);
}
}
class Parrot extends Bird{

    Parrot(String name,String color,int age,double weight){
        super(name,color,age,weight);
        /*this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;*/
    }
}

class Crow extends Bird {
    Crow(String name, String color, int age, double weight){
         /*this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;*/
        super(name,color,age,weight);
    }
}

class Sparrow extends Bird{
    Sparrow(String name,String color,int age,double weight){
    super(name,color,age,weight);
    }
}


class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Zeki","Green",2,1);
        parrot.printInfo();

        Crow crow=new Crow("Crow","black",3,1.5);
        crow.printInfo();

        Sparrow sparrow=new Sparrow("","",2,5);
        sparrow.printInfo();
    }
}