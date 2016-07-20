package com.andreylh.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieService {

    private static final List<String> MOVIES = Arrays.asList("Ghostbusters (1984)", "Ghostbusters (2016)", "Matrix (1999)");

	@RequestMapping(value="/")
	public List<String> getAll() {
		return MOVIES;	
	}
	
	@RequestMapping(value="/search")
	public List<String> search(@RequestParam("q") String q) {
		return MOVIES.stream().filter(b -> b.contains(q)).collect(Collectors.toList());		
	}	
}
