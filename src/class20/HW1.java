package class20;

public class HW1 {
    /*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
        Rectangle
        Square
        Box  */

    static void CalculateAreaRectangle(int length,int width){//rectangle
        System.out.println(length*width);
    }
    static void CalculateAreaSquare(int side){//square
        System.out.println(side*side);
    }
    static void CalculateVolumeBox(int length,int width,int height){//box
        System.out.println(length*width*height);
    }

    public static void main(String[] args) {
        CalculateAreaRectangle(10,5);
        CalculateAreaSquare(2);
        CalculateVolumeBox(8,4,2);
    }





}
