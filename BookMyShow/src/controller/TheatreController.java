package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Movie;
import entities.Show;
import entities.Theatre;
import enums.City;

public class TheatreController
{
	private Map<City, List<Theatre>> cityVsTheatre;
	private List<Theatre> allTheatre;

	public TheatreController()
	{
		this.cityVsTheatre = new HashMap<>();
		this.allTheatre = new ArrayList<>();
	}

	public void addTheatre(Theatre theatre, City city)
	{

		allTheatre.add(theatre);

		List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
		theatres.add(theatre);
		cityVsTheatre.put(city, theatres);
	}

	public Map<Theatre, List<Show>> getAllShow(Movie movie, City city)
	{

		// get all the theater of this city

		Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

		List<Theatre> theatres = cityVsTheatre.get(city);

		// filter the theatres which run this movie

		for (Theatre theatre : theatres)
		{

			List<Show> givenMovieShows = new ArrayList<>();
			List<Show> shows = theatre.getShows();

			for (Show show : shows)
			{
				if (show.getMovie().getMovieId() == movie.getMovieId())
				{
					givenMovieShows.add(show);
				}
			}
			if (!givenMovieShows.isEmpty())
			{
				theatreVsShows.put(theatre, givenMovieShows);
			}
		}

		return theatreVsShows;
	}

}
