package com.hr.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class EmployeesEntity {
	
	@Id
	@Column(name="employee_id")
	private  int employeeId;
	
	@Column(name="first_name")
	private String fristName;
	
	@Column(name="lirst_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private int phoneNumber;
	
	@Column(name="hire_date")
	private Date hireDate;
	
	@ManyToOne
	@JoinColumn(name="job_id")
	private JobsEntity jobsEntity;

	@Column(name="salary")
	private double salary;
	
	@Column(name="commission_pct")
	private double commissionPct;
	
	@Column(name="manager_id")
	private int managerId;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private DepartmentsEntity departmentsEntity;

}
