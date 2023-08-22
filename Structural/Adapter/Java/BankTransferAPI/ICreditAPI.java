package Structural.Adapter.Java.BankTransferAPI;

public interface ICreditAPI {
    void getCreditDetails();
    void getCreditScore();
    void giveMoney(int amount);
}
