package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PgcPoi {

	@JsonProperty("_id")
	private String id;

	@JsonProperty("poi_desc")
	private String poiDesc;

	@JsonProperty("poi_image")
	private String poiImage;

	@JsonProperty("poi_image_desc")
	private String poiImageDesc;

	private String type;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoiDesc() {
		return poiDesc;
	}

	public void setPoiDesc(String poiDesc) {
		this.poiDesc = poiDesc;
	}

	public String getPoiImage() {
		return poiImage;
	}

	public void setPoiImage(String poiImage) {
		this.poiImage = poiImage;
	}

	public String getPoiImageDesc() {
		return poiImageDesc;
	}

	public void setPoiImageDesc(String poiImageDesc) {
		this.poiImageDesc = poiImageDesc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
