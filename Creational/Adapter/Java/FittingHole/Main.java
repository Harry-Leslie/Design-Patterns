package Creational.Adapter.Java.FittingHole;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(4);
        SquarePeg squarePeg = new SquarePeg(4);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println(roundHole.fit(squarePegAdapter));
    }
}
