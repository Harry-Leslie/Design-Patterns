package Creational.Adapter.Java.BankTransferAPI;

public class CreditAPI implements ICreditAPI{

    @Override
    public void getCreditDetails() {
        System.out.println("Credit Card Details Given");
    }

    @Override
    public void getCreditScore() {
        System.out.println("Credit Score Given");
    }

    @Override
    public void giveMoney(int amount) {
        System.out.println("Money Recieved -> $" + amount);
    }
    
}
