package com.example.anderson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.anderson.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
