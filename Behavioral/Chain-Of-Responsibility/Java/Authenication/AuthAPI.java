package Authenication;

public class AuthAPI {
    private Handler handler;
    public AuthAPI(Handler handler){
        this.handler=handler;
    }
    public void login(String username, String password){
        if (handler.handleRequest(username, password)){
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry Incorrect");
        }
    }
}
