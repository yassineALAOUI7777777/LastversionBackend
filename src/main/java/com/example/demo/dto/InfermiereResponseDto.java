package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InfermiereResponseDto {
	
	
    private Long id;
	private String nom;
	private String prenom;
	
	

}
