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
@Table(name="job_history")
public class JobHistoryEntity {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private String employeeId;
	
	@Id
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="job_id")
	private JobsEntity jobsEntity;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private DepartmentsEntity departmentsEntity;
}
