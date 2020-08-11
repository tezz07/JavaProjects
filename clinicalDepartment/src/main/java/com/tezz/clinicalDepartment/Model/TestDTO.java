package com.tezz.clinicalDepartment.Model;
import lombok.Getter;
import lombok.Setter;        
@Getter
@Setter

public class TestDTO {

	private String name;
	private String address;
	 
	public TestDTO(String name, String address) {
		this.name= name;
		this.address = address;
	}
}
