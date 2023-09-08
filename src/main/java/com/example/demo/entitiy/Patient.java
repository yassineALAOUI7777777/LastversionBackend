package com.example.demo.entitiy;

import java.io.Serializable;

import java.util.Date;
import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient  implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1920171743342947501L;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  @Column(name = "nom")
	    private String nom;
	  @Column(name = "prenom")
	    private String prenom;
	  @Column(name = "age")
	  private Integer Age;
	 
	  @Column(name = "rendez_vous")
	  private String rendez_vous;

	  // Getter and setter for rendez_vous

	    private Date date_naissance; // Using LocalDate instead of LocalDateTime

	    private String Adresse ;
	  @Column(name = "sexe")
	    private String sexe;
	    private String groupe_sanguine;
	    private Long telephone;

	@OneToMany(mappedBy = "patient" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Rendez_vous> redez_vous; 
}
