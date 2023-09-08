package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.InfermiereRequestDto;
import com.example.demo.dto.InfermiereResponseDto;
import com.example.demo.entitiy.Infermiere;
import com.example.demo.repository.InfermiereRepository;



@Service
public abstract class InfermiereServiceImpl2  implements InfermiereService  {

	private ModelMapper modelMapper;
	private InfermiereRepository infermiereRepository;
	

	

	@Autowired
	public InfermiereServiceImpl2(ModelMapper modelMapper, InfermiereRepository infermiereRepository) {
		super();
		this.modelMapper = modelMapper;
		this.infermiereRepository = infermiereRepository;
	}

	@Override

	public InfermiereResponseDto save(InfermiereRequestDto infermiereRequestDto) {
		
		Infermiere infermiere=modelMapper.map(infermiereRequestDto, Infermiere.class);
		Infermiere saved=infermiereRepository.save(infermiere);
		return modelMapper.map(saved, InfermiereResponseDto.class);
	}

	
	@Override
	public InfermiereResponseDto findById(Long id) {
		Infermiere infermiere=infermiereRepository.findById(id).orElseThrow();
  return modelMapper.map(infermiere, InfermiereResponseDto.class);
	}

	@Override
	public InfermiereResponseDto findByNom(String nom) {
		Infermiere infermiere =infermiereRepository.findByNom(nom);
		return modelMapper.map(infermiere, InfermiereResponseDto.class);
	}

	@Override
	public InfermiereResponseDto finndByPrenom(String prenom) {
		Infermiere infermiere =infermiereRepository.findByPrenom(prenom);
		return modelMapper.map(infermiere, InfermiereResponseDto.class);
	}

	

	@Override
	public void delete(Long id) {
		infermiereRepository.deleteById(id);

	}
	

	@Override
	public List<InfermiereResponseDto> findAll() {
		return infermiereRepository.findAll()
				.stream().map(el->modelMapper.map(el, InfermiereResponseDto.class))
				.collect(Collectors.toList());
		
	}

	@Override
	public InfermiereResponseDto update(InfermiereRequestDto infermiereRequestDto, Long id)  {
	    Optional<Infermiere> infermiereOptional = infermiereRepository.findById(id);
	    if (infermiereOptional.isPresent()) {
	    	Infermiere infermiere = modelMapper.map(infermiereRequestDto, Infermiere.class);
	    	infermiere.setId(id);
	    	Infermiere updated = infermiereRepository.save(infermiere);
	    	
	    	return modelMapper.map(updated,InfermiereResponseDto.class);		
	    }
		return null;
	        
	    
	}
}

