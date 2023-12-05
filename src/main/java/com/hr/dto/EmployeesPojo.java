package com.hr.dto;

import java.sql.Date;
import lombok.Data;

@Data
public class EmployeesPojo {
	
	private  int employee_id;
	private String frist_name;
	private String last_name;
	private String email;
	private int phone_number;
	private Date hire_date;
	private JobsPojo jobsPojo;
	private double salary;
	private double commission_pct;
	private int manager_id;
	private DepartmentsPojo departmentsPojo;
}
