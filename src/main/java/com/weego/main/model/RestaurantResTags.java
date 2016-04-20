package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestaurantResTags {
	@JsonProperty("_id")
	private String id;

	@JsonProperty("en_name")
	private String name;
	private String title;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
