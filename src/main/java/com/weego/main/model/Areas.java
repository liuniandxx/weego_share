package com.weego.main.model;

import java.util.Date;
import java.util.List;

import org.mongojack.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Areas {
	@Id
	private String id;

	@JsonProperty("__v")
	private Integer version;

	private String address;

	@JsonProperty("area_name")
	private String areaName;

	@JsonProperty("area_enname")
	private String areaEnName;

	@JsonProperty("area_introduce")
	private String introduce;

	@JsonProperty("brief_introduce")
	private String briefIntroduce;

	private List<String> categories;

	@JsonProperty("city_id")
	private String cityId;

	@JsonProperty("city_name")
	private String cityName;

	private List<BasePOIComments> comments;

	@JsonProperty("cover_image")
	private String coverImage;

	@JsonProperty("data_invalid")
	private Boolean dataInvalid;

	private Integer duration;

	@JsonProperty("en_info")
	private AreasEnInfo enInfo;

	private List<String> image;

	@JsonProperty("image_url")
	private List<BasePOIImageUrl> imageUrl;

	private String latitude;

	private List<Double> loc;

	private String longitude;

	@JsonProperty("name_en")
	private String nameEn;

	@JsonProperty("open_time")
	private String openTime;

	@JsonProperty("recommand_flag")
	private Integer recommandFlag;

	@JsonProperty("recommand_reason")
	private String recommandReason;

	@JsonProperty("show_flag")
	private Integer showFlag;

	private List<String> tags;

	private List<AreasTags> shoptags;

	private String tel;

	private String tips;

	private String traffic;

	private String type;

	private String website;

	private Object periods;

	@JsonProperty("place_id")
	private Object placeId;

	@JsonProperty("comments_from")
	private Object commentsFrom;

	private String lable;

	@JsonProperty("create_flag")
	private Object createFlag;
	
	@JsonProperty("checkFlag")
	private Object checkFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaEnName() {
		return areaEnName;
	}

	public void setAreaEnName(String areaEnName) {
		this.areaEnName = areaEnName;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getBriefIntroduce() {
		return briefIntroduce;
	}

	public void setBriefIntroduce(String briefIntroduce) {
		this.briefIntroduce = briefIntroduce;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
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

	public List<BasePOIComments> getComments() {
		return comments;
	}

	public void setComments(List<BasePOIComments> comments) {
		this.comments = comments;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public Boolean getDataInvalid() {
		return dataInvalid;
	}

	public void setDataInvalid(Boolean dataInvalid) {
		this.dataInvalid = dataInvalid;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public AreasEnInfo getEnInfo() {
		return enInfo;
	}

	public void setEnInfo(AreasEnInfo enInfo) {
		this.enInfo = enInfo;
	}

	public List<String> getImage() {
		return image;
	}

	public void setImage(List<String> image) {
		this.image = image;
	}

	public List<BasePOIImageUrl> getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(List<BasePOIImageUrl> imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public List<Double> getLoc() {
		return loc;
	}

	public void setLoc(List<Double> loc) {
		this.loc = loc;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public Integer getRecommandFlag() {
		return recommandFlag;
	}

	public void setRecommandFlag(Integer recommandFlag) {
		this.recommandFlag = recommandFlag;
	}

	public String getRecommandReason() {
		return recommandReason;
	}

	public void setRecommandReason(String recommandReason) {
		this.recommandReason = recommandReason;
	}

	public Integer getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(Integer showFlag) {
		this.showFlag = showFlag;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<AreasTags> getShoptags() {
		return shoptags;
	}

	public void setShoptags(List<AreasTags> shoptags) {
		this.shoptags = shoptags;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Object getPeriods() {
		return periods;
	}

	public void setPeriods(Object periods) {
		this.periods = periods;
	}

	public Object getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Object placeId) {
		this.placeId = placeId;
	}

	public Object getCommentsFrom() {
		return commentsFrom;
	}

	public void setCommentsFrom(Object commentsFrom) {
		this.commentsFrom = commentsFrom;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public Object getCreateFlag() {
		return createFlag;
	}

	public void setCreateFlag(Object createFlag) {
		this.createFlag = createFlag;
	}

}
