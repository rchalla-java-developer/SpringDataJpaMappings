package org.rk.jpa.mapping.service;

import java.util.List;

import org.rk.jpa.mapping.entity.Employee;
import org.rk.jpa.mapping.repository.EmployeeRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepositoy employeeRepositoy;

	public List<Employee> saveEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employeeRepositoy.saveAll(employees);
	}

    public List<Employee> getEmployees() {
		return employeeRepositoy.findAll();
    }

	public Employee getEmployeeById(Long employeeId) {
		return employeeRepositoy.findByEmployeeId(employeeId);
	}
}
