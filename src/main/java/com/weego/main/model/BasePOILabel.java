package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasePOILabel {
	@JsonProperty("_id")
	private String id;

	private String label;
	@JsonProperty("label_en")
	private String labelEn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabelEn() {
		return labelEn;
	}

	public void setLabelEn(String labelEn) {
		this.labelEn = labelEn;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
