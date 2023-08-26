package Authenication;

public class HandlePassword extends BaseHandler{

    Database database;
    public HandlePassword(Database database){
        this.database=database;
    }

    @Override
    public boolean handleRequest(String Username, String Password) {
        if (!this.database.isCorrectPassword(Username, Password)){
            return false;
        } else if (nextHandler != null){
            return nextHandler.handleRequest(Username, Password);
        } else {
            return true;
        }
    }
}
