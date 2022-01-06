package chess;

public class Move
{
    private Player player;
    private Spot start;
    private Spot end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castlingMove = false;

    public Move(Player player, Spot start, Spot end) {
     this.player = player;
     this.start = start;
     this.end = end;
     this.pieceMoved = start.getPiece();
    }

    public boolean isCastlingMove ()
    {
        return castlingMove;
    }

    public void setCastlingMove (boolean castlingMove)
    {
        this.castlingMove = castlingMove;
    }

    public Spot getStart ()
    {
        return start;
    }

    public void setStart (Spot start)
    {
        this.start = start;
    }

    public Spot getEnd ()
    {
        return end;
    }

    public void setEnd (Spot end)
    {
        this.end = end;
    }

    public Piece getPieceKilled ()
    {
        return pieceKilled;
    }

    public void setPieceKilled (Piece pieceKilled)
    {
        this.pieceKilled = pieceKilled;
    }
}
