package com.example.doctor.dto;

public class DoctorDto {

	private int id ;
	private String name;
	private String speciality ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public DoctorDto(int id, String name, String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.speciality = speciality;
	}
	
	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
