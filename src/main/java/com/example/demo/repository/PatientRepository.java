package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.Patient;
@Repository
public interface PatientRepository  extends JpaRepository<Patient, Long>{
	
	Patient findByNom(String nom);
	 Patient findByPrenom(String prenom);

	
	  
}
