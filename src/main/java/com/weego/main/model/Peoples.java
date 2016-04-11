package com.weego.main.model;

import java.util.List;

import org.mongojack.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Peoples {
	
//	private String imageUrl = "http://weegotest.b0.upaiyun.com/brands/iosimgs/";
	
	@Id
	private String id;

	@JsonProperty("city_name")
	private PeoplesCityName cityName;

	@JsonProperty("cover_image")
	private String coverImage;

	@JsonProperty("head_image")
	private String headImage;

	@JsonProperty("job_desc")
	private String jobDesc;

	@JsonProperty("short_introduce")
	private String shortIntroduce;

	@JsonProperty("simple_introduce")
	private List<PeoplesSimpleIntroduce> simpleIntroduce;

	private String type;

	private String username;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PeoplesCityName getCityName() {
		return cityName;
	}

	public void setCityName(PeoplesCityName cityName) {
		this.cityName = cityName;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public String getShortIntroduce() {
		return shortIntroduce;
	}

	public void setShortIntroduce(String shortIntroduce) {
		this.shortIntroduce = shortIntroduce;
	}

	public List<PeoplesSimpleIntroduce> getSimpleIntroduce() {
		return simpleIntroduce;
	}

	public void setSimpleIntroduce(List<PeoplesSimpleIntroduce> simpleIntroduce) {
		this.simpleIntroduce = simpleIntroduce;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
