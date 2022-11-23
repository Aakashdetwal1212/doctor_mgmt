package com.example.doctor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctor.dto.DoctorDto;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@RequestMapping(value = "/get/{doctId}", method = RequestMethod.GET)
	public ResponseEntity<?> getDoctor(@PathVariable("doctId")int doctId){
		return ResponseEntity.ok(new DoctorDto(10231,"James Howerd","Eye Specialist"));
	}
}
