package com.amdocs.commonality.ddu.learning.standalone.model;

import java.util.List;

public class EmployeeSkillset {
	String empID;
	private List<String> actualSkills;
    private List<String> requiredSkills;
    
    public String getEmpID() {
		return empID;
	}
	
	public void setEmpID(String empID) {
		this.empID = empID;
	}

    public List<String> getActualSkills() {
        return actualSkills;
    }

    public void setActualSkills(List<String> actualSkills) {
        this.actualSkills = actualSkills;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

}
