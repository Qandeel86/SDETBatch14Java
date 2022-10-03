package class15;

public class LocalVarDemo {

    public static void main(String[] args) {
        int number=0;
        /*
        local variables are defined inside blocks of code
        and can only be used inside those blocks
         */
        //System.out.println(name);<- will give error

        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        {
            int i=0;
        }
        //System.out.println(i);
    }

    void printNumber(){
        //cannot access int number=0 inside here, because that is local variable
        //System.out.println(number); <- will give error
        String name="Allan";
    }
}
