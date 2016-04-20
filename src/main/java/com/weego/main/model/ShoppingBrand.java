package com.weego.main.model;

import org.mongojack.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShoppingBrand {

	@Id
	private String id;

	@JsonProperty("cover_image")
	private String coverImage;

	private String title;
	private String desc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

}
