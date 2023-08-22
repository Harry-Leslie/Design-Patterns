package Structural.Adapter.Java.BankTransferAPI;

public class Client {
    public static void main(String[] args) {
        CreditAPI creditAPI = new CreditAPI();
        NewCreditAPI newCreditAPI = new NewCreditAPI();
        CreditAPIAdapter creditAPIAdapter = new CreditAPIAdapter(newCreditAPI);

        // Incompatible Interface
        creditAPI.getCreditDetails();
        creditAPI.getCreditScore();
        creditAPI.giveMoney(4);
        // Adapter
        creditAPIAdapter.getCreditDetails();
        creditAPIAdapter.getCreditScore();
        creditAPIAdapter.giveMoney(4, 1);
    }
}
