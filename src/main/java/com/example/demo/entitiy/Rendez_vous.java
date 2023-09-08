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
public class Rendez_vous implements Serializable {
    // Other fields and annotations

    /**
	 * 
	 */
	private static final long serialVersionUID = -2029297607501982573L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom_patient;
    private String Prenom_patient;
    private Date Date_Rendez_vous;
    private String Heure_Rendez_vous;

    @ManyToOne
    private Patient patient;

    @OneToOne(mappedBy = "rendez_vous")
    private Consultation consultation;
}
