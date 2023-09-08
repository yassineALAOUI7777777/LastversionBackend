package com.example.demo.entitiy;

import java.io.Serializable;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Ordonnance  implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -8814983901998241754L;

	@Id
	@GeneratedValue()
	
	private  String  nom_patient;
	private String prenom_patient;
	private Date date;
	@ManyToOne
	private Medicament medicament;
	@ManyToOne
	private Medecin medecin;
}

