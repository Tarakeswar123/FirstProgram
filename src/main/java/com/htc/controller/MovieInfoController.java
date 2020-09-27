package com.htc.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.htc.beans.MovieInfo;
import com.htc.service.MovieInfoService;

@RestController
public class MovieInfoController 
{
	@Autowired
	private MovieInfoService movieInfoService;

//	@GetMapping("/movie-info/movie-list")
//	public MovieInfoList getAllUser() {
//		MovieInfoList movieInfoList=new MovieInfoList();
//		movieInfoList.setMovieInfos(movieInfoService.getAllUsers());
//		return movieInfoList;
//	}

	
	@GetMapping("/movie-info/movie-list")
	public List<MovieInfo> getAllUser() {
		return movieInfoService.getAllUsers();
	}
	
	@GetMapping("/movie-info-id/{id}")
	public MovieInfo getMovieById(@PathVariable("id") String movieId)
	{
		return movieInfoService.getMovieById(movieId);
	}
	
	@PostMapping("/movie-info/add-movie")
	public MovieInfo addMovieInfoData(@RequestBody MovieInfo movieInfo)
	{
		return movieInfoService.addMovieInfo(movieInfo);
	}
	
}
