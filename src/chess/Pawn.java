package chess;

public class Pawn extends Piece
{

    public Pawn (boolean white)
    {
        super(white);
    }

    public boolean canMove (Board board, Spot start, Spot end)
    {
        return false;
    }
}
