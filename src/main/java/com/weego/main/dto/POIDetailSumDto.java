package com.weego.main.dto;

import java.util.List;

public class POIDetailSumDto {
	private String id;
	private Integer type;
	private String name;
	private String nameEn;
	private String address;
	private String tel;
	private String website;
	private String briefIntroduction;
	private String introduction;
	private String cityName;
	private String cityId;
	private String latitude;
	private String longitude;
	private List<String> image;
	private String coverImage;
	private List<String> openTime;
	private String priceDesc;
	private Double rating;
	private List<POIDetailSpecialDto> special;
	private List<POIDetailActivitiesDto> activities;
	private List<POIDetailTagDto> tag;
	private String tips;
	private String commentsUrl;
	private String commentFrom;
	private List<POIDetailCommentsDto> comments;
	private Double distance;
	private String openTimeDesc;
	private String openTableUrl;
	private Integer openDay;
	private POIDetailFacilitiesDto facilities;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getBriefIntroduction() {
		return briefIntroduction;
	}

	public void setBriefIntroduction(String briefIntroduction) {
		this.briefIntroduction = briefIntroduction;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public List<String> getImage() {
		return image;
	}

	public void setImage(List<String> image) {
		this.image = image;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public List<String> getOpenTime() {
		return openTime;
	}

	public void setOpenTime(List<String> openTime) {
		this.openTime = openTime;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public List<POIDetailSpecialDto> getSpecial() {
		return special;
	}

	public void setSpecial(List<POIDetailSpecialDto> special) {
		this.special = special;
	}

	public List<POIDetailActivitiesDto> getActivities() {
		return activities;
	}

	public void setActivities(List<POIDetailActivitiesDto> activities) {
		this.activities = activities;
	}

	public List<POIDetailTagDto> getTag() {
		return tag;
	}

	public void setTag(List<POIDetailTagDto> tag) {
		this.tag = tag;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getCommentsUrl() {
		return commentsUrl;
	}

	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	public String getCommentFrom() {
		return commentFrom;
	}

	public void setCommentFrom(String commentFrom) {
		this.commentFrom = commentFrom;
	}

	public List<POIDetailCommentsDto> getComments() {
		return comments;
	}

	public void setComments(List<POIDetailCommentsDto> comments) {
		this.comments = comments;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getOpenTimeDesc() {
		return openTimeDesc;
	}

	public void setOpenTimeDesc(String openTimeDesc) {
		this.openTimeDesc = openTimeDesc;
	}

	public String getOpenTableUrl() {
		return openTableUrl;
	}

	public void setOpenTableUrl(String openTableUrl) {
		this.openTableUrl = openTableUrl;
	}

	public Integer getOpenDay() {
		return openDay;
	}

	public void setOpenDay(Integer openDay) {
		this.openDay = openDay;
	}

	public POIDetailFacilitiesDto getFacilities() {
		return facilities;
	}

	public void setFacilities(POIDetailFacilitiesDto facilities) {
		this.facilities = facilities;
	}

}
