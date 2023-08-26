package Structural.Bridge.Java.TVRemote;

public class TV {
    public static void main(String[] args) {
        AbstractDevice abstractDevice = new ConcreteTV();
        AbstractRemote remote = new TVRemote(abstractDevice);
        remote.button1();
        remote.button1();
        remote.button2();
        remote.button3();
        remote.button1();
        System.out.println(abstractDevice.getVolume());        
        System.out.println(abstractDevice.getChannel());

    }
}
