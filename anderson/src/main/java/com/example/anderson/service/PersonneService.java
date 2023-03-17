package com.example.anderson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.anderson.model.Personne;
import com.example.anderson.repository.PersonneRepository;

@Service
public class PersonneService {

	@Autowired 
	private PersonneRepository personneRepository;
	
	//Permet de recupérer toutes les personnes enregistrées
	public List<Personne> read(){
		return personneRepository.findAll();
	}
	
	public Personne create(Personne personne) {
		return personneRepository.save(personne);
	}
	
}
