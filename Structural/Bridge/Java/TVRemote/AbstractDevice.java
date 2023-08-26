package Structural.Bridge.Java.TVRemote;

public abstract class AbstractDevice {

    int volume;
    int channel;
    
    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public abstract void getModel();
}
