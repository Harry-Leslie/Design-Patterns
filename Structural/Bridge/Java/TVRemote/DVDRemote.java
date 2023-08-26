package Structural.Bridge.Java.TVRemote;

public class DVDRemote extends AbstractRemote{

    public DVDRemote(AbstractDevice device) {
        super(device);
    }

    @Override
    public void button1() {
        System.out.println("Volume up on the DvD Device");
        this.device.setVolume(this.device.getVolume()+1);
    }

    @Override
    public void button2() {
        System.out.println("Volume down on the DvD Device");
        this.device.setVolume(this.device.getVolume()-1);
    }

    @Override
    public void button3() {
        System.out.println("Channel up on the DvD Device");
        this.device.setChannel(this.device.getChannel()+1);
    }

    @Override
    public void button4() {
        System.out.println("Channel down on the DvD Device");
        this.device.setChannel(this.device.getChannel()-1);
    }
    
}
