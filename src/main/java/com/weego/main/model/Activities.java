package com.weego.main.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongojack.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activities {
	@Id
	private ObjectId Id;

	@JsonProperty("activity_city")
	private ActivitiesCity activityCity;

	@JsonProperty("acttime")
	private String actTime;

	@JsonProperty("acturl")
	private String actUrl;

	@JsonProperty("address")
	private String address;

	@JsonProperty("atype")
	private String atype;

	@JsonProperty("close_time")
	private String closeTime;

	@JsonProperty("cover_image")
	private String coverImage;

	@JsonProperty("deaddress")
	private String detailAddress;

	@JsonProperty("desc")
	private String desc;

	@JsonProperty("end_time")
	private Date endTime;

	@JsonProperty("images_desc")
	private List<ActivitiesImagesDesc> imageDesc;

	private String latitude;

	private String longitude;

	@JsonProperty("open_time")
	private String openTime;

	@JsonProperty("order_url")
	private String orderUrl;

	private String price;

	@JsonProperty("start_time")
	private String startTime;

	private String title;

	private String type;

	public ObjectId getId() {
		return Id;
	}

	public void setId(ObjectId id) {
		Id = id;
	}

	public ActivitiesCity getActivityCity() {
		return activityCity;
	}

	public void setActivityCity(ActivitiesCity activityCity) {
		this.activityCity = activityCity;
	}

	public String getActTime() {
		return actTime;
	}

	public void setActTime(String actTime) {
		this.actTime = actTime;
	}

	public String getActUrl() {
		return actUrl;
	}

	public void setActUrl(String actUrl) {
		this.actUrl = actUrl;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<ActivitiesImagesDesc> getImageDesc() {
		return imageDesc;
	}

	public void setImageDesc(List<ActivitiesImagesDesc> imageDesc) {
		this.imageDesc = imageDesc;
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

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getOrderUrl() {
		return orderUrl;
	}

	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

}
