package com.tezz.clinicalDepartment.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tezz.clinicalDepartment.Model.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Long> {


	List<ClinicalData> findByPatientIdAndComponentNameOrderByMeasuredDateAndTime(long patientId, String componentName);

}
