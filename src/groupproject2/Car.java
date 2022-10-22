package groupproject2;

public class Car {
    /*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
which should be returning a price of the car.Create 2 sub classes: Sedan and Truck. The Truck class has a
field as weight and has its own implementation of calculateSalePrice() method in which returned price is
calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20%
discount.The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount */

    double carPrice;
    String carColor;

    Car(double carPrice, String carColor){
        this.carPrice=carPrice;
        this.carColor=carColor;
    }

    double calculateSalePrice(){

        return carPrice;
    }
}

class Truck extends Car{
    double carWeight;

    Truck(double carPrice,String carColor,double carWeight){
        super(carPrice,carColor);
        this.carWeight=carWeight;
    }

    @Override
    double calculateSalePrice() {
        double salePrice = 0;
        if(carWeight>2000){
            return salePrice=carPrice-(carPrice*0.10);
        }else
            return salePrice=carPrice-(carPrice*0.20);
    }
}

class Sedan extends Car{
    double carLength;

    Sedan(double carPrice,String carColor,double length){
        super(carPrice,carColor);
        this.carLength=carLength;
    }

    @Override
    double calculateSalePrice() {
        if(carLength>20){
            return carPrice=carPrice-(carPrice*.05);
        }else
            return carPrice=carPrice-(carPrice*.10);
    }
}

