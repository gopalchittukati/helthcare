package com.slokam.helthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.Dao.PatientDao;
import com.slokam.helthcare.entity.Patient;

@RestController
public class PatientController {
	@Autowired
	private PatientDao patientdao;
	@RequestMapping("savepatient")
	public void savePatient(@RequestBody Patient p) {
		patientdao.save(p);
		
		
	}

}
