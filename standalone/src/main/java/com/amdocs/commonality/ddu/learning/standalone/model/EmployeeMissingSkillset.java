package com.amdocs.commonality.ddu.learning.standalone.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMissingSkillset {
	String empID;
	List<String> missingSkills = new ArrayList<>();
	
	public String getEmpID() {
		return empID;
	}
	
	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public List<String> getMissingSkills() {
		return missingSkills;
	}
	
	public void setMissingSkills(List<String> missingSkills) {
		this.missingSkills = missingSkills;
	}
}
