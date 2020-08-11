package com.tezz.clinicalDepartment.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClinicalDataRequest {

	private String componentName;
	
	private String componentValue;
	
	private long patient_Id;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp measuredDateAndTime;
}
