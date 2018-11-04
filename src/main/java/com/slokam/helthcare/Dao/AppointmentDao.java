package com.slokam.helthcare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.helthcare.entity.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long>{

}
