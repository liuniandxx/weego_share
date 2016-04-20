package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActivitiesImagesDesc {
	private String imagePath = "http://weegotest.b0.upaiyun.com/restaurant/origin/";

	@JsonProperty("desc")
	private String detail;

	@JsonProperty("image_desc")
	private String imageBrief;

	@JsonProperty("image_id")
	private String imageUrl;

	@JsonProperty("title")
	private String imageTitle;

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImageBrief() {
		return imageBrief;
	}

	public void setImageBrief(String imageBrief) {
		this.imageBrief = imageBrief;
	}

	public String getImageUrl() {
		return imagePath + imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageTitle() {
		return imageTitle;
	}

	public void setImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
	}

}
