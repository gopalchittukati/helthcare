package com.slokam.helthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="disease")
public class Disease {
	@Id
	@GeneratedValue
	private Long id;
	private String desciption;
	private String name;

}
