package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttractionSpot {

	@JsonProperty("cover_image")
	private String coverImage;

	private String title;
	private String desc;
	private String advice;

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

}
