package com.tezz.clinicalDepartment.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tezz.clinicalDepartment.Dao.PatientServices;
import com.tezz.clinicalDepartment.Model.ClinicalData;
import com.tezz.clinicalDepartment.Model.Patient;
import com.tezz.clinicalDepartment.Util.BMICalculator;


@RestController
@CrossOrigin
public class PatientController {

	
	@Autowired
	PatientServices patientServices;
	
	Map<String, String> filters = new HashMap<>();
	
	
	@GetMapping(path = "/patients")
	public List<Patient> getPatientsDetails(){
		
		return patientServices.getPatientsDetails();		
	}
	
	@PostMapping(path = "/save_patient_details")
	public Patient savePatientData( @RequestBody Patient patient)
	{
		return patientServices.savePatientData(patient);
		
		
	}
		
		
	
	@GetMapping(path = "/patients/{id}")
	public Patient getPatientsByid(@PathVariable("id") long id){
		
		return patientServices.getPatientsByid(id);			
		

	
	}
	
	
	@GetMapping(path = "/patients/analize/{id}")
	public Patient getPatientsAnalize(@PathVariable("id") long id){
		
		Patient patient = patientServices.getPatientsByid(id);			
		
		List<ClinicalData> clinicalData = patient.getClinicalData();
		
		ArrayList<ClinicalData> duplicatecClinicalData = new ArrayList<>(clinicalData);
		
		for(ClinicalData eachEntry:duplicatecClinicalData) {
			
			if(filters.containsKey(eachEntry.getComponentName())) {
				
				clinicalData.remove(eachEntry);
			}
			else {
				filters.put(eachEntry.getComponentName(),null);
			}
			
			 BMICalculator.calculateBMI(clinicalData, eachEntry);
			 
		}
		filters.clear();
          return patient;
	
	}

		
	
	
}
