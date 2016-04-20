package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PgcCity {
	@JsonProperty("_id")
	private String id;

	@JsonProperty("cityname")
	private String cityName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
