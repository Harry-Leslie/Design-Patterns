package Authenication;
public class HandleUsername extends BaseHandler{

    Database database;
    public HandleUsername(Database database){
        this.database=database;
    }

    @Override
    public boolean handleRequest(String Username, String Password) {
        if (!this.database.checkUsername(Username)){
            return false;
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(Username, Password);
        } else {
            return true;
        }
    }
    
}
