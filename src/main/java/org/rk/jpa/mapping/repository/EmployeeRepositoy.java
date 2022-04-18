package org.rk.jpa.mapping.repository;

import org.rk.jpa.mapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoy extends JpaRepository<Employee, Long>{

    Employee findByEmployeeId(Long id);
}
