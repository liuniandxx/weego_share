package com.weego.main.model;

import org.mongojack.Id;

public class BasePOITag {

	@Id
	private String id;

	private String tag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
