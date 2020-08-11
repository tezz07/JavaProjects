package com.tezz.clinicalDepartment.Util;

import java.util.List;

import com.tezz.clinicalDepartment.Model.ClinicalData;

public class BMICalculator {
	public static void calculateBMI(List<ClinicalData> clinicalData, ClinicalData eachEntry) {
		if(eachEntry.getComponentName().equals("HW")) {
				 
		String [] heightAndWeight	= eachEntry.getComponentValue().split("/");
			
		if(heightAndWeight!=null&&heightAndWeight.length>1) {
			
		float heightInMeter = Float.parseFloat(heightAndWeight[0])* 0.4536f;
			float bmi = Float.parseFloat(heightAndWeight[1])/ (heightInMeter*heightInMeter);

			ClinicalData BmiData = new ClinicalData();
		 	
			BmiData.setComponentName("bmi");
			BmiData.setComponentValue(Float.toString(bmi));
			clinicalData.add(BmiData);
		   
		   }
		  
		 }
	}

}
