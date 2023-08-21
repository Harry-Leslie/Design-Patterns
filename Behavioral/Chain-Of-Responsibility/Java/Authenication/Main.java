package Authenication;
public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler usernameHandler = new HandleUsername(database);
        Handler passwordHandler = new HandlePassword(database);

        usernameHandler.setNextHandler(passwordHandler);

        AuthAPI authAPI = new AuthAPI(usernameHandler);
        authAPI.login("Harry", "Password");
    }
}