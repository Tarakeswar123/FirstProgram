package com.htc.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.htc.beans.MovieInfo;

public interface MovieInfoRepository extends JpaRepository<MovieInfo, String>
{
	
}
