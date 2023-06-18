package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.example.demo.Enums.Gender;
import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name = "doctors")

public class Doctor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int docId;

    public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(int docId, String name, int age, Gender gender, String emailId, VaccinationCenter vaccinationCenter,
			List<Appointment> appointmentList) {
		super();
		this.docId = docId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emailId = emailId;
		this.vaccinationCenter = vaccinationCenter;
		this.appointmentList = appointmentList;
	}


	public int getDocId() {
		return docId;
	}


	public void setDocId(int docId) {
		this.docId = docId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public VaccinationCenter getVaccinationCenter() {
		return vaccinationCenter;
	}


	public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}


	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}


	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}


	private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(unique = true)
    private String emailId;


    @ManyToOne
    @JoinColumn
    private VaccinationCenter vaccinationCenter;


    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    private List<Appointment> appointmentList = new ArrayList<>();

}
