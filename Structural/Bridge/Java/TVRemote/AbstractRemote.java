package Structural.Bridge.Java.TVRemote;

public abstract class AbstractRemote {
    AbstractDevice device;
    public AbstractRemote(AbstractDevice device){
        this.device = device;
    }

    public abstract void button1();
    public abstract void button2();
    public abstract void button3();
    public abstract void button4();
}
