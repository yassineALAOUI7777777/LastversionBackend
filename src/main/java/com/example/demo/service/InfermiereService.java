package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.InfermiereRequestDto;
import com.example.demo.dto.InfermiereResponseDto;

public interface InfermiereService {
	
	InfermiereResponseDto save(InfermiereRequestDto  infermiereRequestDto);
	
	InfermiereResponseDto findById(Long id);
	
	InfermiereResponseDto findByNom(String nom);
	
	InfermiereResponseDto finndByPrenom(String prenom);
	
	InfermiereResponseDto finndBysexe(String sexe);
	
	void delete(Long id);
	
	InfermiereResponseDto update(InfermiereRequestDto  infermiereRequestDto , Long id) ;

	List<InfermiereResponseDto> findAll();
	




}
