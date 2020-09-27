package com.htc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_info")
public class MovieInfo 
{
	@Id
	@Column(name = "movie_id")
	private String movieId;
	@Column(name="movie_name")
	private String movieName;
	@Column(name="movie_director")
	private String movieDirector;
	
	public MovieInfo()
	{
		
	}

	public MovieInfo(String movieId, String movieName, String movieDirector) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	@Override
	public String toString() {
		return "MovieInfo [movieId=" + movieId + ", movieName=" + movieName + ", movieDirector=" + movieDirector + "]";
	}
	
}
