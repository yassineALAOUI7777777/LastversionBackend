package com.example.demo.entitiy;


import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Consultation implements Serializable {
	private static final long serialVersionUID = 54115441546959220L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	  private Date date;
	    private double montant;
	    private double versement;
	    private double reste;

	

	@OneToOne
	private Rendez_vous rendez_vous;

	@ManyToOne
	private Infermiere infermiere;

	@ManyToOne
	private Medecin medecin;

	// Constructors, getters, setters, etc.
}
