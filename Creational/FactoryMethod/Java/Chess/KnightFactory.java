package Creational.FactoryMethod.Java.Chess;

public class KnightFactory implements IPieceFactory{

    @Override
    public Piece createPiece() {
        return new Knight();
    }
    
}
