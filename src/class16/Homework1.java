package class16;

public class Homework1 {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
    int sum=0;
    int sumNum(int array[]){
        for(int i=0;i< array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Homework1 main=new Homework1();
        System.out.println(main.sumNum(new int[]{1,2,3,4,5}));
    }
}
