package chess;

public class Knight extends Piece
{
    public Knight(boolean white){
        super(white);
    }

    public boolean canMove(Board board, Spot start, Spot end){
        // we can't move the piece top a spot that has a piece of same colour
        if(end.getPiece().isWhite() == this.isWhite()){
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        return x*y ==2;
    }
}
