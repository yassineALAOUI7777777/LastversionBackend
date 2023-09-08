package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PatientRequestDto;
import com.example.demo.dto.PatientResponseDto;

import com.example.demo.entitiy.Patient;

import com.example.demo.repository.PatientRepository;

@Service("patientServiceImpl2")

public class PatientServiceImpl2 implements PatientService {
	
	private ModelMapper modelMapper;
	private PatientRepository patientRepository;
	
	

	public PatientServiceImpl2(ModelMapper modelMapper, PatientRepository patientRepository) {
		super();
		this.modelMapper = modelMapper;
		this.patientRepository = patientRepository;
	}

	@Override
	public PatientResponseDto save(PatientRequestDto patientRequestDto) {
		Patient patient=modelMapper.map(patientRequestDto, Patient.class);
		Patient saved=patientRepository.save(patient);
		return modelMapper.map(saved, PatientResponseDto.class);
	}

	@Override
	public PatientResponseDto findById(Long id) {
		Patient patient = patientRepository.findById(id).orElseThrow();
  return modelMapper.map(patient, PatientResponseDto.class);
	}


	@Override
	public PatientResponseDto findByNom(String nom) {
	    Patient patient = patientRepository.findByNom(nom);
	    
	    
	    return modelMapper.map(patient, PatientResponseDto.class);
	}

	public PatientResponseDto findByPrenom(String prenom) {
	    Patient patient = patientRepository.findByPrenom(prenom);
	    
	    if (patient == null) {
	        return null; // Renvoyer null si aucun patient n'est trouvé
	    }
	    
	    return modelMapper.map(patient, PatientResponseDto.class);
	}




	@Override
	public void delete(Long id) {
		patientRepository.deleteById(id);

	}

	@Override
	public PatientResponseDto update(PatientRequestDto patientRequestDto, Long id)  {
	    Optional<Patient> patientOptional = patientRepository.findById(id);
	    if (patientOptional.isPresent()) {
	    	Patient patient = modelMapper.map(patientRequestDto, Patient.class);
	    	patient.setId(id);
	    	Patient updated = patientRepository.save(patient);
	    	
	    	return modelMapper.map(updated,PatientResponseDto.class);		
	    }
		return null;
	        
	    
	}

	@Override
	public List<PatientResponseDto> findAll() {
		return patientRepository.findAll()
				.stream().map(el->modelMapper.map(el, PatientResponseDto.class))
				.collect(Collectors.toList());
		
	}

	@Override
	public PatientResponseDto findByRendez_vous(String Rendez_vous) {
		// TODO Auto-generated method stub
		return null;
	}


}
