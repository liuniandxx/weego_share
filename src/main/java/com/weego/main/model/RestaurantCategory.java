package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestaurantCategory {
	@JsonProperty("_id")
	private String id;
	private String name;
	@JsonProperty("en_name")
	private String enName;
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
