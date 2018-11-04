package com.slokam.helthcare.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="complaint")
public class Complaint {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	@JoinTable( name="complaint_disease",
	joinColumns= {@JoinColumn(name="cfid")},
	inverseJoinColumns= {@JoinColumn(name="defid")})

	private List<Disease>disease;
	private String Description;
	@ManyToOne
	@JoinColumn(name="vfid")
	private Visiting visting;
	public Visiting getVisting() {
		return visting;
	}
	public void setVisting(Visiting visting) {
		this.visting = visting;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Disease> getDisease() {
		return disease;
	}
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	

}
