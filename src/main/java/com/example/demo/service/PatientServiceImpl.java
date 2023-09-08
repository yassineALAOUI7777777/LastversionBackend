package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.PatientRequestDto;
import com.example.demo.dto.PatientResponseDto;
@Service
public class PatientServiceImpl  implements PatientService {

	@Override
	public PatientResponseDto save(PatientRequestDto patientRequestDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientResponseDto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientResponseDto findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public PatientResponseDto findByRendez_vous(String Rendez_vous) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientResponseDto findByPrenom(String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PatientResponseDto update(PatientRequestDto infermiereRequestDto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PatientResponseDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
