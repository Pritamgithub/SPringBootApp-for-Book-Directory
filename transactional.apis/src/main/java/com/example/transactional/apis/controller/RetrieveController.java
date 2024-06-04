package com.example.transactional.apis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.transactional.apis.models.Book;
import com.example.transactional.apis.repository.RetrievefromDatabase;


@RestController 
// Rest controller is the combination of controller and response body
@RequestMapping("api")
public class RetrieveController {
	@Autowired 
	RetrievefromDatabase retrievefromdatabase;

	@GetMapping()
	public Book getBook(@PathVariable int id) {
		return retrievefromdatabase.findBookById(id);
}

	

	
}