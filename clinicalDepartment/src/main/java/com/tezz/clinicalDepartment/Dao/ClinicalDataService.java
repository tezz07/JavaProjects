package com.tezz.clinicalDepartment.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tezz.clinicalDepartment.Model.ClinicalData;
import com.tezz.clinicalDepartment.Repos.ClinicalDataRepository;

@Service
public class ClinicalDataService {

	@Autowired
	private ClinicalDataRepository clinicalDataRepository;
	
	public ClinicalData saveClinicalData(ClinicalData clinicalData) {
		// TODO Auto-generated method stub
		return clinicalDataRepository.save(clinicalData);
	}

	public List<ClinicalData> getClinicalData(long patientId, String componentName) {
		// TODO Auto-generated method stub
//		clinicalDataRepository.findByPatientIdAndComponentNameOrderByMeasuredDateAndTime(patientId,componentName);
		return clinicalDataRepository.findByPatientIdAndComponentNameOrderByMeasuredDateAndTime(patientId,componentName);

	}

	

}
