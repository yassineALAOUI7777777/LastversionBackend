package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.Medicament;

@Repository
public interface MedicamentRepository  extends JpaRepository<Medicament, String>{

}
