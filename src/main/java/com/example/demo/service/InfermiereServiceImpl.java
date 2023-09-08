package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.InfermiereRequestDto;
import com.example.demo.dto.InfermiereResponseDto;

@Service
public class InfermiereServiceImpl  implements InfermiereService {

	
	@Override
	public List<InfermiereResponseDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InfermiereResponseDto save(InfermiereRequestDto infermiereRequestDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InfermiereResponseDto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InfermiereResponseDto findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InfermiereResponseDto finndByPrenom(String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InfermiereResponseDto update(InfermiereRequestDto infermiereRequestDto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InfermiereResponseDto finndBysexe(String sexe) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
