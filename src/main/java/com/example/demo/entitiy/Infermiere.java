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
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Infermiere implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1316701043062865125L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nom;
	private String prenom;
	
	@OneToMany(mappedBy = "infermiere" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Consultation> consultation;


}
