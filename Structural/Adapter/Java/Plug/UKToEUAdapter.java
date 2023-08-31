package Structural.Adapter.Java.Plug;

public class UKToEUAdapter extends PlugEU {
    PlugUK plugUK;
    public UKToEUAdapter(PlugUK plugUK){
        this.plugUK = plugUK;
    }
    
    @Override
    public String typeOfPlug(){
        return plugUK.typeOfPlug();
    }
}
