package com.example.demo.entitiy;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
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
public class Medicament implements Serializable {
    private static final long serialVersionUID = -6966672485771824589L;

    @Id
    @GeneratedValue()
    private String nom;  // This will be the primary key
    
    private String forme_medicament;
    private double prix;

    @OneToMany(mappedBy = "medicament", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ordonnance> ordonnance;
    
    // Constructors, getters, setters, etc.
}

