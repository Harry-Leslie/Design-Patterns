package Behavioral.Command.Java.Lights;

public class TurnOnLight implements Command {
    Light light;
    TurnOnLight(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.On();
    }
    
}
