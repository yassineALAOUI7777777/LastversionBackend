package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.PatientRequestDto;
import com.example.demo.dto.PatientResponseDto;
import com.example.demo.service.PatientService;
@CrossOrigin
@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    @Autowired
   
    public PatientController(@Qualifier("patientServiceImpl2") PatientService patientService) {
        this.patientService = patientService;
    }
    @GetMapping
    public List<PatientResponseDto> getPatient(){ 
        return patientService.findAll();
    }
    
    
    
    
    @PostMapping
    public   ResponseEntity<PatientResponseDto> save(@RequestBody PatientRequestDto patientRequestDto) {
    	 PatientResponseDto savedPatient = patientService.save(patientRequestDto);
         return ResponseEntity.status(HttpStatus.CREATED).body(savedPatient);
    }
    
    @GetMapping("/id/{id}")
	public PatientResponseDto findById( @PathVariable("id") Long id) {
		return patientService.findById(id);
	}
    
    @GetMapping("/nom/{nom}")
   	public PatientResponseDto findByNom(@PathVariable String nom) {
   		return patientService.findByNom(nom);
   	}
    
   
    
    
    @GetMapping("/prenom/{prenom}")
	public PatientResponseDto findByPrenom(@PathVariable String prenom) {
		return patientService.findByPrenom(prenom);
	}
    
    @DeleteMapping("/id/{id}")
	public void delete(@PathVariable() Long id) {
		patientService.delete(id);
	}
    
    @PutMapping("/id/{id}")
	public PatientResponseDto update (@RequestBody()  PatientRequestDto patientRequestDto, @PathVariable Long id) {
		return patientService.update(patientRequestDto, id);
	}
	
	   

	    
	   
}
