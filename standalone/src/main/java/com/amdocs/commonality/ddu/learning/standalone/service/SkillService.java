package com.amdocs.commonality.ddu.learning.standalone.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

//import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeSkillset;


@Service
public class SkillService {
	
//	public List<String> validateSkills(EmployeeSkillset employeeSkillset, EmployeeSkillset requiredSkillset) {
//        return requiredSkillset.stream()
//                .filter(skill -> !employeeSkillset.contains(skill))
//                .collect(Collectors.toList());
//    }
	
	public List<String> findMissingSkills(List<String> actualSkills, List<String> requiredSkills) {
        return requiredSkills.stream()
                .filter(skill -> !actualSkills.contains(skill))
                .collect(Collectors.toList());
    }


}
