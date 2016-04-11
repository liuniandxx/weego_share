package com.weego.main.model;

import java.util.Date;
import java.util.List;

import org.mongojack.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasePOI {

	@Id
	private String id;

	@JsonProperty("activities")
	private List<BasePOIActivities> activities;

	@JsonProperty("master_label")
	private List<BasePOILabel> masterLabel;

	@JsonProperty("sub_tag")
	private List<BasePOITag> subTag;

	@JsonProperty("cover_image")
	private String coverImage;

	private List<String> image;
	private String name;

	@JsonProperty("name_en")
	private String nameEn;

	@JsonProperty("city_id")
	private String cityId;

	@JsonProperty("city_name")
	private String cityName;

	private String address;

	private String introduction;

	@JsonProperty("brief_introduction")
	private String briefIntroduction;

	private String coordination;

	@JsonProperty("open_time")
	private List<String> openTime;

	@JsonProperty("open_table_url")
	private String openTableUrl;

	@JsonProperty("is_show")
	private boolean isShow;

	@JsonProperty("price_desc")
	private String priceDesc;

	@JsonProperty("price_level")
	private Integer priceLevel;

	private String tips;
	private Double rating;
	private String website;
	private String tel;

	@JsonProperty("comments_from")
	private String commentFrom;

	@JsonProperty("comments_url")
	private String commentsUrl;

	private List<BasePOIComments> comments;

	@JsonProperty("last_modified_time")
	private Date lastModifiedTime;

	@JsonProperty("last_modified_person")
	private String lastModifiedPerson;

	private Integer type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<BasePOIActivities> getActivities() {
		return activities;
	}

	public void setActivities(List<BasePOIActivities> activities) {
		this.activities = activities;
	}

	public List<BasePOILabel> getMasterLabel() {
		return masterLabel;
	}

	public void setMasterLabel(List<BasePOILabel> masterLabel) {
		this.masterLabel = masterLabel;
	}

	public List<BasePOITag> getSubTag() {
		return subTag;
	}

	public void setSubTag(List<BasePOITag> subTag) {
		this.subTag = subTag;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public List<String> getImage() {
		return image;
	}

	public void setImage(List<String> image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getBriefIntroduction() {
		return briefIntroduction;
	}

	public void setBriefIntroduction(String briefIntroduction) {
		this.briefIntroduction = briefIntroduction;
	}

	public String getCoordination() {
		return coordination;
	}

	public void setCoordination(String coordination) {
		this.coordination = coordination;
	}

	public List<String> getOpenTime() {
		return openTime;
	}

	public void setOpenTime(List<String> openTime) {
		this.openTime = openTime;
	}

	public String getOpenTableUrl() {
		return openTableUrl;
	}

	public void setOpenTableUrl(String openTableUrl) {
		this.openTableUrl = openTableUrl;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public Integer getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(Integer priceLevel) {
		this.priceLevel = priceLevel;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCommentFrom() {
		return commentFrom;
	}

	public void setCommentFrom(String commentFrom) {
		this.commentFrom = commentFrom;
	}

	public String getCommentsUrl() {
		return commentsUrl;
	}

	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	public List<BasePOIComments> getComments() {
		return comments;
	}

	public void setComments(List<BasePOIComments> comments) {
		this.comments = comments;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getLastModifiedPerson() {
		return lastModifiedPerson;
	}

	public void setLastModifiedPerson(String lastModifiedPerson) {
		this.lastModifiedPerson = lastModifiedPerson;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
