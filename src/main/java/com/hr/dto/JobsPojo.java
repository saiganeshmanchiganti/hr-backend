package com.hr.dto;

import lombok.Data;

@Data
public class JobsPojo {
	private int job_id;
	private String job_title;
	private double min_salary;
	private double max_salary;
}
