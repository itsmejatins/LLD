package model.piece;

public class PieceX extends PlayingPiece
{
	public PieceX()
	{
		super(PieceType.X);
	}
	
	@Override
	public String toString()
	{
		return  "X";
	}
}
