package Creational.FactoryMethod.Java.Chess;

public class RookFactory implements IPieceFactory{

    @Override
    public Piece createPiece() {
        return new Rook();
    }
    
}
