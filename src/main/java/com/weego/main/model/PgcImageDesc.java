package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PgcImageDesc {
	@JsonProperty("image_title")
	private String imageTitle;

	@JsonProperty("p_PGC_Id")
	private String pgcId;

	@JsonProperty("poi_image_desc")
	private String poiImageDesc;

	@JsonProperty("section_image")
	private String sectionImage;

	public String getImageTitle() {
		return imageTitle;
	}

	public void setImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
	}

	public String getPgcId() {
		return pgcId;
	}

	public void setPgcId(String pgcId) {
		this.pgcId = pgcId;
	}

	public String getSectionImage() {
		return sectionImage;
	}

	public void setSectionImage(String sectionImage) {
		this.sectionImage = sectionImage;
	}

	public String getPoiImageDesc() {
		return poiImageDesc;
	}

	public void setPoiImageDesc(String poiImageDesc) {
		this.poiImageDesc = poiImageDesc;
	}

}
