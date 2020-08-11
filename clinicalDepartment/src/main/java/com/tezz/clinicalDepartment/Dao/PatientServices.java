package com.tezz.clinicalDepartment.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tezz.clinicalDepartment.Model.Patient;
import com.tezz.clinicalDepartment.Repos.ClinicalDataRepository;
import com.tezz.clinicalDepartment.Repos.PatientRepository;

@Service
public class PatientServices {

	@Autowired
	PatientRepository patientRepository;
	@Autowired
	ClinicalDataRepository clinicalDataRepository;
	
	public List<Patient> getPatientsDetails() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}


	public Patient savePatientData(Patient patient) {
		return patientRepository.save(patient);
	}


	public Patient getPatientsByid(long id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id).get();
	}


	

}
