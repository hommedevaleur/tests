package com.example.anderson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.anderson.service.PersonneService;


@RestController
public class PersonneController {
	@Autowired
	private PersonneService personneService;
	
	//charger toutes les personnes
	@GetMapping("/view/personne")
	public List<Personne> getPersonne(){
		//List<Article> article = articleProxyService.getArticles();
		return personneService.read();
	}
}
