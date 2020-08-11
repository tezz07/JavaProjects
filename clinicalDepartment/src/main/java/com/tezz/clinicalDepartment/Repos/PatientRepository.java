package com.tezz.clinicalDepartment.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tezz.clinicalDepartment.Model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	

	

}
