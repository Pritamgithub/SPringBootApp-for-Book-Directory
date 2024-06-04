package com.example.transactional.apis.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	int id;
	String name;
	String author;
	String releaseyear = "2024";
}
