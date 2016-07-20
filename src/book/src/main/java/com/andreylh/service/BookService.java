package com.andreylh.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class BookService {
	
	private static final List<String> BOOKS = Arrays.asList("Lord of the Rings", "Game Of Thrones", "Harry Potter");

	@GET	
	public List<String> getAll() {
		return BOOKS;
	}
	
	@GET
	@Path("search")
	public List<String> search(@QueryParam("q") String q) {
		return BOOKS.stream().filter(b -> b.contains(q)).collect(Collectors.toList());
	}
	
}
