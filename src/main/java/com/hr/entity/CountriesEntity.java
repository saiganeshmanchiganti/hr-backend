package com.hr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "countries")
public class CountriesEntity {
	
	@Id
	@Column(name="country_id")
	private String countryId;
	
	@Column(name="country_name")
	private String countryName;
	
	@ManyToOne
	@JoinColumn(name = "region_id")
	private RegionsEntity regionsEntity;
	
}
