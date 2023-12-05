package com.hr.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class JobHistoryPojo {
	private EmployeesPojo employeesPojo;
	private Date start_date;
	private Date end_date;
	private JobsPojo jobsPojo;
	private DepartmentsPojo departmentsPojo;
}
