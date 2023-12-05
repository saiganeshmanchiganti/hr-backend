package com.hr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="departments")
public class DepartmentsEntity {
	
	@Id
	@Column(name="department_id")
	private int departmentId;
	
	@Column(name="department_name")
	private String department_name;
	
	@ManyToOne
	@JoinColumn(name="manager_id")
	private EmployeesEntity employeesEntity;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private LocationsEntity locationsEntity;
	
}
