package com.andreylh.service;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class MovieServiceTest {

	MovieService movieService;

	@Before
	public void setUp() {
		movieService = new MovieService();
	}

	@Test
	public void searchOne() {
		String searchParam = "Ma";
		List<String> result = movieService.search(searchParam);

		Assertions.assertThat(result).isNotNull();
		Assertions.assertThat(result).hasSize(1);
	}
	
	@Test
	public void searchNone() {
		String searchParam = "Blade";
		List<String> result = movieService.search(searchParam);

		Assertions.assertThat(result).isNotNull();
		Assertions.assertThat(result).hasSize(0);
	}

}
