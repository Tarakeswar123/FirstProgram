package com.htc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.htc.beans.MovieInfo;

@Service
public class MovieInfoService {
	@Autowired
	private MovieInfoRepository movieInfoRepository;

	public List<MovieInfo> getAllUsers() {
		List<MovieInfo> movieRecords = new ArrayList<>();
		movieInfoRepository.findAll().forEach(movieRecords::add);
		return movieRecords;
	}

	public MovieInfo getMovieById(String movieId) {
		Optional<MovieInfo> optional=movieInfoRepository.findById(movieId);
		return optional.get();
	}
	
	public MovieInfo addMovieInfo(MovieInfo movieInfo)
	{
		return movieInfoRepository.save(movieInfo);
	}
}
