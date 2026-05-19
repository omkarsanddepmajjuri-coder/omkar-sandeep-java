package com.hms.model;

public class Doctor {
		private int doctorId;
	private String name;
	private String specialization;
	private String contactNumber;

	public Doctor(int doctorId, String name, String specialization, String contactNumber) {
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
		this.contactNumber = contactNumber;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}
