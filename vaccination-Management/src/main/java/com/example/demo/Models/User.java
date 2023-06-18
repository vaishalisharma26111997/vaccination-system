package com.example.demo.Models;
import com.example.demo.Enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.*;
import jakarta.persistence.*;
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment and auto generated
    private int userId;

    @Column(name = "user_name")
    private String name;

    private int age;

    @Column(unique = true)//if dublicate value entered give exception
    private String emailId;

    @Enumerated(EnumType.STRING)//save the value enumtype to in form of string in db
    private Gender gender;

    private String mobileNo;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Dose dose;
    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
     private List<Appointment> appointmentList = new ArrayList<>();

   public User() {
		super();
		// TODO Auto-generated constructor stub
	}

public User(int userId, String name, int age, String emailId, Gender gender, String mobileNo, Dose dose,
			List<Appointment> appointmentList) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.dose = dose;
		this.appointmentList = appointmentList;
	}

public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

public Dose getDose() {
       return dose;
   }

    public void setDose(Dose dose) {
        this.dose = dose;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
