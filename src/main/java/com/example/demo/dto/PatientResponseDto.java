package com.example.demo.dto;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateConverter;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PatientResponseDto {
	
	private Long id;
	private String Nom;
	private String Prenom;

	 private String rendez_vous;
    private Date date_naissance; // Using LocalDate instead of LocalDateTime
	private String Adresse ;
	private String sexe;
	private Integer Age;
	  private String groupe_sanguine;
	private Long telephone;

}
