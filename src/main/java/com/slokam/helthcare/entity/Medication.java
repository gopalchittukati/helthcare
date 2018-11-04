package com.slokam.helthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="medication")
public class Medication {
	@Id
	@GeneratedValue
private Long id;
private String howtouse;
private String  qunatity;
private Integer duration;
@ManyToOne
@JoinColumn(name="mfid")
private Medicine medicine;
@ManyToOne
@JoinColumn(name="cfid")
private Complaint complaint;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getHowtouse() {
	return howtouse;
}
public void setHowtouse(String howtouse) {
	this.howtouse = howtouse;
}
public String getQunatity() {
	return qunatity;
}
public void setQunatity(String qunatity) {
	this.qunatity = qunatity;
}
public Integer getDuration() {
	return duration;
}
public void setDuration(Integer duration) {
	this.duration = duration;
}
public Medicine getMedicine() {
	return medicine;
}
public void setMedicine(Medicine medicine) {
	this.medicine = medicine;
}
}
