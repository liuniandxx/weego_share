package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mongojack.Id;

import java.util.List;

public class Pgcs {

	@Id
	private String id;

	@JsonProperty("c_end_time")
	private String cEndTime;

	@JsonProperty("c_start_time")
	private String cStartTime;

	private String content;

	@JsonProperty("cover_image")
	private String coverImage;

	@JsonProperty("end_time")
	private String endTime;

	private String introducation;

	@JsonProperty("pgc_city")
	private PgcCity pgcCity;

	@JsonProperty("pgc_country")
	private String pgcCountry;

	@JsonProperty("pgc_images_desc")
	private List<PgcImageDesc> pgcImagesDesc;

	@JsonProperty("pgc_people")
	private PgcPeople pgcPeople;

	@JsonProperty("pgc_poi")
	private List<PgcPoi> pgcPoi;

	@JsonProperty("pgc_tags")
	private String pgcTags;

	@JsonProperty("pgc_title")
	private String pgcTitle;

	@JsonProperty("start_time")
	private String startTime;

	private String title;

	private String type;

	private PgcOriginal original;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getcEndTime() {
		return cEndTime;
	}

	public void setcEndTime(String cEndTime) {
		this.cEndTime = cEndTime;
	}

	public String getcStartTime() {
		return cStartTime;
	}

	public void setcStartTime(String cStartTime) {
		this.cStartTime = cStartTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIntroducation() {
		return introducation;
	}

	public void setIntroducation(String introducation) {
		this.introducation = introducation;
	}

	public PgcCity getPgcCity() {
		return pgcCity;
	}

	public void setPgcCity(PgcCity pgcCity) {
		this.pgcCity = pgcCity;
	}

	public String getPgcCountry() {
		return pgcCountry;
	}

	public void setPgcCountry(String pgcCountry) {
		this.pgcCountry = pgcCountry;
	}

	public List<PgcImageDesc> getPgcImagesDesc() {
		return pgcImagesDesc;
	}

	public void setPgcImagesDesc(List<PgcImageDesc> pgcImagesDesc) {
		this.pgcImagesDesc = pgcImagesDesc;
	}

	public PgcPeople getPgcPeople() {
		return pgcPeople;
	}

	public void setPgcPeople(PgcPeople pgcPeople) {
		this.pgcPeople = pgcPeople;
	}

	public List<PgcPoi> getPgcPoi() {
		return pgcPoi;
	}

	public void setPgcPoi(List<PgcPoi> pgcPoi) {
		this.pgcPoi = pgcPoi;
	}

	public String getPgcTags() {
		return pgcTags;
	}

	public void setPgcTags(String pgcTags) {
		this.pgcTags = pgcTags;
	}

	public String getPgcTitle() {
		return pgcTitle;
	}

	public void setPgcTitle(String pgcTitle) {
		this.pgcTitle = pgcTitle;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PgcOriginal getOriginal() {
		return original;
	}

	public void setOriginal(PgcOriginal original) {
		this.original = original;
	}

}
