package Structural.Adapter.Java.BankTransferAPI;

public class CreditAPIAdapter implements ICreditAPI{

    NewCreditAPI newCreditAPI;

    CreditAPIAdapter(NewCreditAPI newCreditAPI){
        this.newCreditAPI = newCreditAPI;
    }

    @Override
    public void getCreditDetails() {
        this.newCreditAPI.getCreditInfo();
    }

    @Override
    public void giveMoney(int amount) {
        System.err.println("Please provide an ID");
    }
    
    public void giveMoney(int amount, int id){
        this.newCreditAPI.giveMoney(amount, id);
    }
    @Override
    public void getCreditScore() {
        this.newCreditAPI.getCreditScore();
    }
    
}
