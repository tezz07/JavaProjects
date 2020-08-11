package com.tezz.clinicalDepartment.Model;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;        
@Getter
@Setter
@ToString
@Entity
@Table(name = "clinicaldata")
public class ClinicalData {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "component_name")
	private String componentName;
	@Column(name = "component_value")
	private String componentValue;
	@Column(name = "measured_date_time")
	private Timestamp measuredDateAndTime;
	
   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="patient_id",nullable = false) 
    @JsonIgnore
    private Patient patient;
	 
}
