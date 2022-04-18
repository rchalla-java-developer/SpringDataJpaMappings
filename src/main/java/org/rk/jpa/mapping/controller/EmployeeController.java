package org.rk.jpa.mapping.controller;

import java.util.List;

import org.rk.jpa.mapping.entity.Employee;
import org.rk.jpa.mapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees/save")
	public List<Employee> saveEmployees(@RequestBody List<Employee> employees){
		return employeeService.saveEmployees(employees);
	}

	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}

	@GetMapping("/getEmployeeById/{empId}")
	public Employee getEmployee(@PathVariable Long empId){
		return employeeService.getEmployeeById(empId);
	}

}
