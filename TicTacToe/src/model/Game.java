package model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import model.piece.PieceO;
import model.piece.PieceX;

public class Game
{
	private Deque<Player> players;
	private Board board;

	public Game(int size)
	{
		initializeGame(size);
	}

	private void initializeGame(int size)
	{
		players = new LinkedList<>();
		players.add(new Player("p1", new PieceX()));
		players.add(new Player("p2", new PieceO()));
		
		board = new Board(size);
	}

	private void startGame()
	{
		boolean winnerFound = false;
		Player winner = null;
		Scanner sc = new Scanner(System.in);
		while (!winnerFound)
		{
			board.printBoard();
			if (!board.freeSpaceAvailable())
			{
				System.out.println("The match is draw");
				sc.close();
				return;
			}
			Player curr = players.peekFirst();
			try 
			{
				System.out.println("Enter row,col");
				String[] input = sc.nextLine().split(",");
		
				int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]);
				if (board.addPiece(x, y, curr.getPiece()))
				{
					players.offerLast(players.pollFirst());
					if (board.checkForWinner() != null)
					{
						winnerFound = true;
						board.printBoard();
						winner = curr;
						if (board.checkForWinner() != curr.getPiece())
						{
							System.out.println("some thing is wrong");
							sc.close();
							break;
						}
					}
				}
				else
				{
					System.out.println("Position already occupied");
					continue;
				}
			}
			catch (RuntimeException e)
			{
				System.out.println("Invalid Input, please try again");
				continue;
			}
		

		}
		System.out.println("The winner is " + winner);
		sc.close();
	}

	public static void main(String[] args)
	{
		Game g1 = new Game(3);
		g1.startGame();
	}

}
