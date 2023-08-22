package Structural.Adapter.Java.BankTransferAPI;

public class NewCreditAPI {

    public void getCreditInfo() {
        System.out.println("Credit Card Info Given");
    }

    
    public void getCreditScore() {
        System.out.println("Credit Score has been given out");
    }

    public void giveMoney(int amount, int id){
        System.out.println(id + " has just given $" + amount);
    }
}
