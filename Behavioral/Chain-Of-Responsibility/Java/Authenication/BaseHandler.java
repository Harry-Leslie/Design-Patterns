package Authenication;
public abstract class BaseHandler implements Handler {

    protected Handler nextHandler;
    

    public Handler setNextHandler(Handler handler){
        this.nextHandler = handler;
        return this.nextHandler;
    }

}
