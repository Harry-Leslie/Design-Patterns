package Behavioral.Command.Java.Lights;

public class TurnOffLight implements Command {

    Light light;
    TurnOffLight(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.Off();
    }
    
}
