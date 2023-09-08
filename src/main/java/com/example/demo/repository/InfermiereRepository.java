package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.Infermiere;
@Repository
public interface InfermiereRepository extends JpaRepository<Infermiere, Long> {

    Infermiere findByNom(String nom);
    Infermiere findByPrenom(String prenom);
    
}
