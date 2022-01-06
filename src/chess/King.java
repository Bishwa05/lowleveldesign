package chess;

public class King extends Piece
{
    private boolean castlingDone = false;

    public King(boolean white){
        super(white);
    }

    public boolean isCastlingDone ()
    {
        return castlingDone;
    }

    public void setCastlingDone (boolean castlingDone)
    {
        this.castlingDone = castlingDone;
    }

    public boolean canMove(Board board, Spot start, Spot end){
        if(end.getPiece().isWhite() == this.isWhite()){
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        if(x + y ==1){
            //check if this move will not result in the king being under attack
            return true;
        }
        return this.isValidCastling(board, start, end);
    }

    private boolean isValidCastling(Board board, Spot start, Spot end){

        if(this.isCastlingDone()){
            return false;
        }
        //Logic for returning true or false
        return true;
    }

    public boolean isCatelingMove(Spot start, Spot end){
        // check if start and pos are correct.
        return false;
    }
}
