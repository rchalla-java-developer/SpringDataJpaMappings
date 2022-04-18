package org.rk.jpa.mapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String employeeName;
	private Integer employeeAge;
	private Long phoneNumber = (long) (Math.random()*Math.pow(10, 10));
	private String employeeAddress;
	private Double salary = Math.random()*10000;
}
