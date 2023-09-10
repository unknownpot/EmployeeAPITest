package com.amdocs.commonality.ddu.learning.standalone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeMissingSkillset;
import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeSkillset;
import com.amdocs.commonality.ddu.learning.standalone.service.SkillService;

@RestController
@RequestMapping("/api/skills")
public class ValidateSkills {
	
//	@Autowired
//	SkillService skillService;
//	
//	@PostMapping ("/find-missing")
//	public ResponseEntity validateSkills(@RequestBody EmployeeSkillset employeeSkillset, @RequestBody EmployeeSkillset requiredSkillset) {
//		EmployeeMissingSkillset employeemissingSkillset = skillService.validateSkills(employeeSkillset, requiredSkillset);
//	}
	
	@Autowired
    private SkillService skillService;

    @PostMapping("/find-missing")
    public List<String> findMissingSkills(@RequestBody EmployeeSkillset request) {
        return skillService.findMissingSkills(request.getActualSkills(), request.getRequiredSkills());
    }
}
