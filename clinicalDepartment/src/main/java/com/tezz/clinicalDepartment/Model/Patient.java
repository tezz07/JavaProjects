package com.tezz.clinicalDepartment.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@Table(name="patient")
public class Patient {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;   
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "first_name")
    private String firstName;
	@Column(name = "age")
	private int age;
 
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "patient") 
	private List<ClinicalData> clinicalData;
	 
}
