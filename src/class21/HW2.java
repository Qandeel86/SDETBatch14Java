package class21;

public class HW2 {
    /*Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
     interest based on the given balance. Create 2 subclasses: Visa and AX. In AX class override method calculate
     interest.Call the method by creating an object of each of the three classes.
     */
}
class CreditCard{
    double balance;
    double interest;
    CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }
    void calculateInterest(){
        System.out.println(interest*balance);
    }
}
class Visa extends CreditCard{
    Visa(double balance,double interest){
        super(balance,interest);
    }

}
class AX extends CreditCard{
    AX(double balance,double interest){
        super(balance,interest);

    }
    @Override
    void calculateInterest() {
        System.out.println("The calculated interest for American Express will be "+interest*balance);
    }
}

class main{
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(3500,5.2);
        Visa visa=new Visa(1400,3.6);
        AX ax=new AX(7300,4.5);

        creditCard.calculateInterest();
        visa.calculateInterest();
        ax.calculateInterest();
    }
}
