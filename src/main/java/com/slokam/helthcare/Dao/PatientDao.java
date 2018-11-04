package com.slokam.helthcare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.helthcare.entity.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient, Long> {

}
