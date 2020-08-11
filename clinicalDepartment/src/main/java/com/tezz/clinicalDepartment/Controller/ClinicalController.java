package com.tezz.clinicalDepartment.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tezz.clinicalDepartment.Dao.ClinicalDataService;
import com.tezz.clinicalDepartment.Dao.PatientServices;
import com.tezz.clinicalDepartment.Model.ClinicalData;
import com.tezz.clinicalDepartment.Model.Patient;
import com.tezz.clinicalDepartment.Model.TestDTO;
import com.tezz.clinicalDepartment.Util.BMICalculator;
import com.tezz.clinicalDepartment.dto.ClinicalDataRequest;

@RestController
@CrossOrigin
public class ClinicalController {

	
	  @Autowired 
	  ClinicalDataService clinicalDataServices;
	  
	  @Autowired
	  PatientServices patientServices;
	  
	  @PostMapping("/Save_Clinical_Data") 
	  public ClinicalData saveClinicalData(@RequestBody ClinicalDataRequest clinicalDataRequest) {
	  
	  Patient patient=patientServices.getPatientsByid(clinicalDataRequest.getPatient_Id());
	  
	  ClinicalData clinicalData = new ClinicalData();
	  
	  clinicalData.setComponentName(clinicalDataRequest.getComponentName());
	  clinicalData.setComponentValue(clinicalDataRequest.getComponentValue());
	  clinicalData.setMeasuredDateAndTime(clinicalDataRequest.getMeasuredDateAndTime());
	 clinicalData.setPatient(patient);
	  return clinicalDataServices. saveClinicalData(clinicalData);
	  
	  
	  }
	  
	  @GetMapping("/clinicals/{patientId}/{componentName}") 
	  public List<ClinicalData> getClinicalData(@PathVariable long patientId,@PathVariable String componentName){
		  
		  if(componentName=="bmi") {
			  
			  componentName="HW";
		  }
		  
		 List<ClinicalData> clinicalData =clinicalDataServices.getClinicalData(patientId,componentName);
		  
			ArrayList<ClinicalData> duplicatecClinicalData = new ArrayList<>(clinicalData);
			for(ClinicalData eachEntry:duplicatecClinicalData) {
				
				 BMICalculator.calculateBMI(clinicalData, eachEntry);
		
			}
		 
		  return clinicalData;
	  }
	  
	  @PostMapping("/show") 
	  public String show(@RequestBody TestDTO clinicalDataRequest) {
		  return "success";
		  
	  }
	  
	  
}
