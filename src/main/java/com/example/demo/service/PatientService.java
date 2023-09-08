package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PatientRequestDto;
import com.example.demo.dto.PatientResponseDto;



public interface PatientService {
	
PatientResponseDto save(PatientRequestDto patientRequestDto);
	
	PatientResponseDto findById(Long id);
	
	PatientResponseDto findByNom(String nom);
	
	PatientResponseDto findByPrenom(String prenom);
	
	PatientResponseDto findByRendez_vous(String Rendez_vous);
	
	void delete(Long id);
	
	PatientResponseDto  update(PatientRequestDto infermiereRequestDto , Long id) ;

	List<PatientResponseDto> findAll();

}
