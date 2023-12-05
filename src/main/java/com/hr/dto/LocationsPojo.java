package com.hr.dto;

import lombok.Data;

@Data

public class LocationsPojo {
	private int Locations_id;
	private String street_address;
	private int postal_code;
	private String city;
	private String state_province;
	private CountriesPojo countriesPojo;
	
}
