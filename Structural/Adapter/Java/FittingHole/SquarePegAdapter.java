package Structural.Adapter.Java.FittingHole;

public class SquarePegAdapter extends RoundPeg {
    SquarePeg squarePeg;
    SquarePegAdapter(SquarePeg squarePeg){
        super(squarePeg.radius);
        this.squarePeg=squarePeg;
    }

}
