package Creational.FactoryMethod.Java.Chess;

public class ChessBoard {
    
    public void movePieces(){
        
        PawnFactory pawnFactory = new PawnFactory();
        KnightFactory knightFactory = new KnightFactory();
        RookFactory rookFactory = new RookFactory();

        Piece pawn = pawnFactory.createPiece();
        Piece knight = knightFactory.createPiece();
        Piece rook = rookFactory.createPiece();

        pawn.move();
        knight.move();
        rook.move();

    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.movePieces();
    }
}
