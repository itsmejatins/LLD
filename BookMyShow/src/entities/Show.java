package entities;

import java.util.ArrayList;
import java.util.List;

public class Show
{
	private Movie movie;
	private Screen screen;
	private List<Integer> bookedSeatIds = new ArrayList<>();;
	private int startTime;

	private int id;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Movie getMovie()
	{
		return movie;
	}

	public void setMovie(Movie movie)
	{
		this.movie = movie;
	}

	public Screen getScreen()
	{
		return screen;
	}

	public void setScreen(Screen screen)
	{
		this.screen = screen;
	}

	public List<Integer> getBookedSeatIds()
	{
		return bookedSeatIds;
	}

	public void setBookedSeatIds(List<Integer> bookedSeatIds)
	{
		this.bookedSeatIds = bookedSeatIds;
	}

	public int getStartTime()
	{
		return startTime;
	}

	public void setStartTime(int startTime)
	{
		this.startTime = startTime;
	}

}
