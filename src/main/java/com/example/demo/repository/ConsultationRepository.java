package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.Consultation;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long>{

}
