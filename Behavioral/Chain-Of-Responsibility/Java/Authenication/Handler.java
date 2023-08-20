package Authenication;
public interface Handler {
    Handler setNextHandler(Handler handler);
    boolean handleRequest(String Username, String Password);
}
