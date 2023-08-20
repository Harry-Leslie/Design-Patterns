package Authenication;
import java.util.HashMap;

public class Database {
    HashMap<String, String> hashmap = new HashMap<>();
    public Database(){
        hashmap.put("Harry", "Password");
    }

    public boolean checkUsername(String username){
        return this.hashmap.containsKey(username);
    }
    public boolean isCorrectPassword(String username, String password){
        return this.hashmap.get(username).equals(password);
    }

}
