package com.example.demo.Models;

import java.time.LocalTime;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vaccination_center")
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String centreName;

    public int getId() {
		return id;
	}

	public VaccinationCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VaccinationCenter(int id, String centreName, LocalTime openingTime, LocalTime closingTime, String address,
			int doseCapacity, List<Doctor> doctorList) {
		super();
		this.id = id;
		this.centreName = centreName;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.address = address;
		this.doseCapacity = doseCapacity;
		this.doctorList = doctorList;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public LocalTime getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDoseCapacity() {
		return doseCapacity;
	}

	public void setDoseCapacity(int doseCapacity) {
		this.doseCapacity = doseCapacity;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	private LocalTime openingTime;

    private LocalTime closingTime;

    private String address;

    private int doseCapacity;

    @OneToMany(mappedBy = "vaccinationCenter",cascade = CascadeType.ALL)
    private List<Doctor> doctorList = new ArrayList<>();

}
