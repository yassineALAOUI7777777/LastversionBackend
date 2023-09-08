package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.Rendez_vous;
@Repository
public interface Rendez_vousRepository  extends JpaRepository<Rendez_vous, Long>{

}
