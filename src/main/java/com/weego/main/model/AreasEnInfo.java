package com.weego.main.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AreasEnInfo {
	@JsonProperty("brief_introduce")
	private String briefIntroduce;
	private List<String> tags;

	public String getBriefIntroduce() {
		return briefIntroduce;
	}

	public void setBriefIntroduce(String briefIntroduce) {
		this.briefIntroduce = briefIntroduce;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
