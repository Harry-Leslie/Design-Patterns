package Structural.Adapter.Java.Plug;

public class Client {
    public static void main(String[] args) {
        SocketEU socketEU = new SocketEU();
        PlugEU plugEU = new PlugEU();
        socketEU.fit(plugEU);

        PlugUK plugUK = new PlugUK();
        UKToEUAdapter ukToEUAdapter = new UKToEUAdapter(plugUK);
        socketEU.fit(ukToEUAdapter);
    }
}
