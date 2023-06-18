package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Doctor;
import com.example.demo.Models.VaccinationCenter;
import com.example.demo.Repository.DoctorRepository;
import com.example.demo.Repository.VaccinationCenterRepository;
import java.util.Optional;
import Exceptions.CenterNotFound;
import Exceptions.DoctorAlreadyExistsException;
import Exceptions.DoctorNotFound;
import Exceptions.EmailIdEmptyException;
import RequestDtos.AssociateDocDto;


@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private VaccinationCenterRepository centerRepository;

    public String addDoctor(Doctor doctor)throws EmailIdEmptyException, DoctorAlreadyExistsException {

        //Validations part is over :
        if(doctor.getEmailId()==null){
            throw new EmailIdEmptyException("Email id is mandatory");
        }

        if(doctorRepository.findByEmailId(doctor.getEmailId())!=null){
            throw new DoctorAlreadyExistsException("Doctor with this emailId already exits.");
        }

        doctorRepository.save(doctor);

        return "Doctor has been added to the database";
    }

    public String associateDoctor(AssociateDocDto associateDocDto)throws DoctorNotFound, CenterNotFound {

        Integer docId = associateDocDto.getDocId();

        Optional<Doctor> doctorOptional = doctorRepository.findById(docId);

        if(!doctorOptional.isPresent()){
            throw new DoctorNotFound("Doctor id is wrong");
        }

        Integer centerId = associateDocDto.getCenterId();

        Optional<VaccinationCenter> optionalCenter = centerRepository.findById(centerId);

        if(!optionalCenter.isPresent()){
            throw new CenterNotFound("Center Id entered is incorrect");
        }

        Doctor doctor = doctorOptional.get();




        VaccinationCenter vaccinationCenter = optionalCenter.get();





        doctor.setVaccinationCenter(vaccinationCenter); //Setting the foreign


        //Set the bidirectional map
        //Adding this doctor the list of doctors of that vaccination Center
        vaccinationCenter.getDoctorList().add(doctor);

        centerRepository.save(vaccinationCenter);

        return "Doctor has been associated to center";

    }
}
