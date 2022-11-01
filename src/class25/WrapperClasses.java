package class25;

public class WrapperClasses {
    public static void main(String[] args) {

        int num=10;
        //Below note is called boxing or manual conversion from primitive to wrapper type:
        //Integer wrappedNum=Integer.valueOf(num);

        //Below is called autoboxing- automatic conversion of a primitive to a wrapper type
        Integer wrappedNum=num;

        System.out.println(wrappedNum);

        //Unboxing is converting a wrapper type to a corresponding primitive type
        //int num2=wrappedNum.intValue();

        //Below is example of auto unboxing-automatic conversion of a wrapper type to a primitive type
        int num2=wrappedNum;
    }
}
