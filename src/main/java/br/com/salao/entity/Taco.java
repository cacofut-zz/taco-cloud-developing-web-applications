package br.com.salao.entity;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	 
	@NotEmpty
	@Size(min = 5, message = "Name must be at least 5 characteres long")
	private String name;
	
	@NotEmpty(message = "You must be choose at least 1 ingredient")
	private List<String> ingredients;
}
