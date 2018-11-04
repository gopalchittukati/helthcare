package com.slokam.helthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.Dao.AppointmentDao;
import com.slokam.helthcare.entity.Appointment;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentDao appointmentdao;
	@RequestMapping("appointsave")
public void appointsave(@RequestBody Appointment appointment) {
	appointmentdao.save(appointment);
}
}
