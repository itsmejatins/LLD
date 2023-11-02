package entities;

import enums.SeatCategory;

public class Seat
{
	private int id;
	private int row;
	private int price;
	SeatCategory sc;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getRow()
	{
		return row;
	}

	public void setRow(int row)
	{
		this.row = row;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public void setSeatCategory(SeatCategory sc)
	{
		this.sc = sc;
		
	}

}
