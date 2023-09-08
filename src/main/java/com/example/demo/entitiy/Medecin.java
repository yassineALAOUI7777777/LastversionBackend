package com.example.demo.entitiy;


import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Medecin implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 8021251085240353637L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nom;
	private String prenom;
	private String specialite;
	private String email;
	private String telephone;
	private String Adresse;
	
	@OneToMany(mappedBy = "medecin" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Consultation> consultation;
	@OneToMany(mappedBy = "medecin")
	private List<Ordonnance> ordonnance;
}
