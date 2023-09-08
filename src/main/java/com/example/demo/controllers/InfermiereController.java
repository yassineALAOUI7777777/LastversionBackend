package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InfermiereRequestDto;
import com.example.demo.dto.InfermiereResponseDto;

import com.example.demo.service.InfermiereService;



@RestController
@RequestMapping("/Infermiers")
public class InfermiereController {
    private InfermiereService infermiereService;

    @Autowired
    public InfermiereController( InfermiereService infermiereService) {
        this.infermiereService = infermiereService;
    }

    @GetMapping
    public List<InfermiereResponseDto> getInfermieres() {
        return infermiereService.findAll();
    }

    @PostMapping
    public   ResponseEntity<InfermiereResponseDto> save(@RequestBody InfermiereRequestDto infermiereRequestDto) {
    	InfermiereResponseDto savedInfermiere = infermiereService.save(infermiereRequestDto);
         return ResponseEntity.status(HttpStatus.CREATED).body(savedInfermiere);
    }
}