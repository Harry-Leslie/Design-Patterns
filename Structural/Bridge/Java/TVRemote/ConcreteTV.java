package Structural.Bridge.Java.TVRemote;

public class ConcreteTV extends AbstractDevice {

    @Override
    public void getModel() {
        System.out.println("Concrete TV");
    }
    
}
