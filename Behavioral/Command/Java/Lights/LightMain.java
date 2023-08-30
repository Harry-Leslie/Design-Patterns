package Behavioral.Command.Java.Lights;

public class LightMain {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOffLight = new TurnOffLight(light);
        Command turnOnLight = new TurnOnLight(light);

        turnOffLight.execute();
        turnOnLight.execute();
    }
}
