package model;

import model.piece.PlayingPiece;

public class Board
{
	private PlayingPiece board[][];
	private int size;

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public Board(int size)
	{
		this.size = size;
		board = new PlayingPiece[size][size];
	}

	public boolean addPiece(int x, int y, PlayingPiece p)
	{
		if (board[x][y] == null)
		{
			board[x][y] = p;
			return true;
		}
		return false;
	}

	public boolean freeSpaceAvailable()
	{
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (board[i][j] == null)
					return true;
			}
		}
		return false;
	}

	public PlayingPiece checkForWinner()
	{
		for (int i = 0; i < size; i++)
		{
			PlayingPiece first = board[i][0];
			if(first == null)
				continue;
			boolean winnerFound = true;

			for (int j = 1; j < size; j++)
			{
				if (board[i][j] != first)
				{
					winnerFound = false;
					break;
				}
			}

			if (winnerFound)
			{
				return first;
			}
		}

		for (int j = 0; j < size; j++)
		{
			PlayingPiece first = board[0][j];
			if(first == null)
				continue;
			boolean winnerFound = true;

			for (int i = 1; i < size; i++)
			{
				if (board[i][j] != first)
				{
					winnerFound = false;
					break;
				}
			}
			if (winnerFound)
			{
				return first;
			}
		}

		PlayingPiece first = board[0][0];
		if(first != null)
		{
			
			boolean winnerFound = true;
			for (int i = 1; i < size; i++)
			{
				if (board[i][i] != first)
				{
					winnerFound = false;
					break;
				}
			}
			if (winnerFound)
				return first;
		}

		first = board[0][size - 1];
		if(first != null)
		{
			
			boolean winnerFound = true;
			
			for (int i = 1; i < size; i++)
			{
				if (board[i][size - 1 - i] != first)
				{
					winnerFound = false;
					break;
				}
			}
			if (winnerFound)
				return first;
		}

		return null;
	}

	public void printBoard()
	{
		System.out.println("****************");
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (board[i][j] == null)
					System.out.print("__");
				else
					System.out.print(board[i][j]);
				if (j != size - 1)
					System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
