package model;

import model.piece.PlayingPiece;

public class Player
{
	private String name;
	private PlayingPiece piece;
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public PlayingPiece getPiece()
	{
		return piece;
	}

	public void setP(PlayingPiece piece)
	{
		this.piece = piece;
	}

	public Player(String name, PlayingPiece p)
	{
		this.name = name;
		this.piece = p;
	}
	
	@Override
	public String toString()
	{
		return this.name + "::" + this.piece;
	}
}
