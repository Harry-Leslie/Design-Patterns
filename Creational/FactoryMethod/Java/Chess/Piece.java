package Creational.FactoryMethod.Java.Chess;

import java.util.ArrayList;

public abstract class Piece {
    ArrayList<String> moves;
    boolean dead;

    public abstract void move();

    public ArrayList<String> getMoves() {
        return moves;
    }

    public boolean isDead() {
        return dead;
    }
}
