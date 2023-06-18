package com.example.demo.Models;
import java.time.LocalTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import RequestDtos.AppointmentReqDto;
import jakarta.persistence.*;

@Entity
@Table(name = "appointments")

public class Appointment {

	

    public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int id, Date appointmentDate, LocalTime appointmentTime, Doctor doctor, User user) {
		super();
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.doctor = doctor;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date appointmentDate;

    private LocalTime appointmentTime;

    @ManyToOne
    @JoinColumn
    private Doctor doctor;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private User user;

	

	


}
