package Structural.Adapter.Java.FittingHole;

public class RoundHole {
    int radius;

    public RoundHole(int radius){
        this.radius=radius;
    }

    public boolean fit(RoundPeg roundPeg){
        return roundPeg.radius <= this.radius;
    }
}
