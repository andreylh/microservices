package com.andreylh.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class MovieService {

	@RequestMapping(value="/ghostbusters")
	public List<String> available() {
		return Arrays.asList("Ghostbusters (1984)", "Ghostbusters (2016)");		
	}
	
	@RequestMapping(value="*")
	public List<String> getAll() {
		return Arrays.asList("Ghostbusters (1984)", "Ghostbusters (2016)", "Matrix (1999)");		
	}	
}
