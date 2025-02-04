package com.hr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RegionsEntity {
	
	@Id
	@Column(name="region_id")
	private int regionId;
	
	@Column(name="region_name")
	private String regionName;
}
