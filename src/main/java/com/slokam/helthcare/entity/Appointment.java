package com.slokam.helthcare.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	private String primaryReason;
	@ManyToOne
	@JoinColumn(name="pfid")
	private Patient patient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimaryReason() {
		return primaryReason;
	}

	public void setPrimaryReason(String primaryReason) {
		this.primaryReason = primaryReason;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
