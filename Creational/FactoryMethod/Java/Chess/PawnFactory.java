package Creational.FactoryMethod.Java.Chess;

public class PawnFactory implements IPieceFactory{

    @Override
    public Piece createPiece() {
        return new Pawn();
    }
    
}
