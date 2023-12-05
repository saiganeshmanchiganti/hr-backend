package com.hr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class UserEntity {
	
	@Id
	@OneToOne
	@Column(name = "employee_id")
	private EmployeesEntity employeesEntity;
	
	@Column(name="role")
	private String role;
	
	@Column(name="password")
	private String password;
	
	
	
}
