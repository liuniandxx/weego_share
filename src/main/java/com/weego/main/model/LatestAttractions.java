package com.weego.main.model;

import java.util.Date;
import java.util.List;

import org.mongojack.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LatestAttractions {
	@Id
	private String id;

	@JsonProperty("__v")
	private Integer version;

	private List<BasePOIActivities> activities;

	private String activity;

	private String address;

	private Boolean am;

	private String attractions;

	@JsonProperty("attractions_en")
	private String attractionsEn;

	@JsonProperty("attractios_en")
	private String attractiosEn;

	private String checkFlag;

	@JsonProperty("city_id")
	private String cityId;

	@JsonProperty("cityid")
	private String cityWrongId;

	@JsonProperty("cityname")
	private String cityName;

	@JsonProperty("city_name")
	private String wrongCityName;

	@JsonProperty("comment_count")
	private Integer commentCount;

	private List<BasePOIComments> comments;

	@JsonProperty("comments_from")
	private String commentsFrom;

	@JsonProperty("comments_top")
	private List<BasePOICommentsTop> commentsTop;

	@JsonProperty("comments_url")
	private String commentsUrl;

	private String coverImageName;

	@JsonProperty("cover_image")
	private String wrongCoverImage;

	private String createFlag;

	private String createPreson;

	private Date created;

	@JsonProperty("data_invalid")
	private Boolean dataInvalid;

	@JsonProperty("dayornight")
	private String dayOrNight;

	private Integer duration;

	@JsonProperty("en_info")
	private BasePOIEnInfo enInfo;

	private Boolean ev;

	private String googleId;

	private List<String> image;

	@JsonProperty("image_url")
	private List<BasePOIImageUrl> imageUrl;

	private Boolean imgFlag;

	@JsonProperty("index_flag")
	private String indexFlag;

	private String introduce;

	private String latitude;

	@JsonProperty("likecount")
	private Integer likeCount;

	private List<Double> loc;

	private String longitude;

	private String masterLabel;

	private Object masterLabelNew;

	@JsonProperty("open_time")
	private Object openTime;

	@JsonProperty("opentime")
	private Object openWrongTime;

	private Boolean pm;

	private String price;

	private String random;

	private Integer rank;

	@JsonProperty("recommand_duration")
	private String recommandDuration;

	@JsonProperty("recommand_flag")
	private String recommandFlag;

	@JsonProperty("recommand_reason")
	private Object recommandReason;

	private Integer reviews;

	@JsonProperty("short_introduce")
	private String shortIntroduce;

	@JsonProperty("show_flag")
	private Integer showFlag;

	private String telno;

	private String tel;

	private String tips;

	@JsonProperty("traffic_info")
	private String trafficInfo;

	private String type;

	private String website;

	@JsonProperty("yelp_rating")
	private Object yelpRating;

	@JsonProperty("yelp_review_count")
	private Integer yelpReviewCount;

	@JsonProperty("yelp_update_time")
	private Double yelpUpdateTime;

	private List<AttractionSpot> spot;

	private List<String> subLabel;

	private List<BasePOILabel> subLabelNew;

	private Object periods;

	private Object score;

	@JsonProperty("price_level")
	private Object priceLevel;

	@JsonProperty("create_flag")
	private Object cerateFlag;

	private Object userCreateLabels;

	@JsonProperty("user_id")
	private String userId;

	private Object unset;

	@JsonProperty("area_name")
	private Object areaName;

	@JsonProperty("area_introduce")
	private Object areaIntroduce;

	@JsonProperty("brief_introduce")
	private String briefIntroduce;

	@JsonProperty("place_id")
	private String placeId;

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

	public List<BasePOIActivities> getActivities() {
		return activities;
	}

	public void setActivities(List<BasePOIActivities> activities) {
		this.activities = activities;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getAm() {
		return am;
	}

	public void setAm(Boolean am) {
		this.am = am;
	}

	public String getAttractions() {
		return attractions;
	}

	public void setAttractions(String attractions) {
		this.attractions = attractions;
	}

	public String getAttractionsEn() {
		return attractionsEn;
	}

	public void setAttractionsEn(String attractionsEn) {
		this.attractionsEn = attractionsEn;
	}

	public String getAttractiosEn() {
		return attractiosEn;
	}

	public void setAttractiosEn(String attractiosEn) {
		this.attractiosEn = attractiosEn;
	}

	public String getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityWrongId() {
		return cityWrongId;
	}

	public void setCityWrongId(String cityWrongId) {
		this.cityWrongId = cityWrongId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public List<BasePOIComments> getComments() {
		return comments;
	}

	public void setComments(List<BasePOIComments> comments) {
		this.comments = comments;
	}

	public String getCommentsFrom() {
		return commentsFrom;
	}

	public void setCommentsFrom(String commentsFrom) {
		this.commentsFrom = commentsFrom;
	}

	public List<BasePOICommentsTop> getCommentsTop() {
		return commentsTop;
	}

	public void setCommentsTop(List<BasePOICommentsTop> commentsTop) {
		this.commentsTop = commentsTop;
	}

	public String getCommentsUrl() {
		return commentsUrl;
	}

	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	public String getCoverImageName() {
		return coverImageName;
	}

	public void setCoverImageName(String coverImageName) {
		this.coverImageName = coverImageName;
	}

	public String getCreateFlag() {
		return createFlag;
	}

	public void setCreateFlag(String createFlag) {
		this.createFlag = createFlag;
	}

	public String getCreatePreson() {
		return createPreson;
	}

	public void setCreatePreson(String createPreson) {
		this.createPreson = createPreson;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Boolean getDataInvalid() {
		return dataInvalid;
	}

	public void setDataInvalid(Boolean dataInvalid) {
		this.dataInvalid = dataInvalid;
	}

	public String getDayOrNight() {
		return dayOrNight;
	}

	public void setDayOrNight(String dayOrNight) {
		this.dayOrNight = dayOrNight;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public BasePOIEnInfo getEnInfo() {
		return enInfo;
	}

	public void setEnInfo(BasePOIEnInfo enInfo) {
		this.enInfo = enInfo;
	}

	public Boolean getEv() {
		return ev;
	}

	public void setEv(Boolean ev) {
		this.ev = ev;
	}

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
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

	public Boolean getImgFlag() {
		return imgFlag;
	}

	public void setImgFlag(Boolean imgFlag) {
		this.imgFlag = imgFlag;
	}

	public String getIndexFlag() {
		return indexFlag;
	}

	public void setIndexFlag(String indexFlag) {
		this.indexFlag = indexFlag;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
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

	public String getMasterLabel() {
		return masterLabel;
	}

	public void setMasterLabel(String masterLabel) {
		this.masterLabel = masterLabel;
	}

	public Object getMasterLabelNew() {
		return masterLabelNew;
	}

	public void setMasterLabelNew(Object masterLabelNew) {
		this.masterLabelNew = masterLabelNew;
	}

	public Object getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Object openTime) {
		this.openTime = openTime;
	}

	public Object getOpenWrongTime() {
		return openWrongTime;
	}

	public void setOpenWrongTime(Object openWrongTime) {
		this.openWrongTime = openWrongTime;
	}

	public Boolean getPm() {
		return pm;
	}

	public void setPm(Boolean pm) {
		this.pm = pm;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getRecommandDuration() {
		return recommandDuration;
	}

	public void setRecommandDuration(String recommandDuration) {
		this.recommandDuration = recommandDuration;
	}

	public String getRecommandFlag() {
		return recommandFlag;
	}

	public void setRecommandFlag(String recommandFlag) {
		this.recommandFlag = recommandFlag;
	}

	public Object getRecommandReason() {
		return recommandReason;
	}

	public void setRecommandReason(Object recommandReason) {
		this.recommandReason = recommandReason;
	}

	public Integer getReviews() {
		return reviews;
	}

	public void setReviews(Integer reviews) {
		this.reviews = reviews;
	}

	public String getShortIntroduce() {
		return shortIntroduce;
	}

	public void setShortIntroduce(String shortIntroduce) {
		this.shortIntroduce = shortIntroduce;
	}

	public Integer getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(Integer showFlag) {
		this.showFlag = showFlag;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getTrafficInfo() {
		return trafficInfo;
	}

	public void setTrafficInfo(String trafficInfo) {
		this.trafficInfo = trafficInfo;
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

	public Object getYelpRating() {
		return yelpRating;
	}

	public void setYelpRating(Object yelpRating) {
		this.yelpRating = yelpRating;
	}

	public Integer getYelpReviewCount() {
		return yelpReviewCount;
	}

	public void setYelpReviewCount(Integer yelpReviewCount) {
		this.yelpReviewCount = yelpReviewCount;
	}

	public Double getYelpUpdateTime() {
		return yelpUpdateTime;
	}

	public void setYelpUpdateTime(Double yelpUpdateTime) {
		this.yelpUpdateTime = yelpUpdateTime;
	}

	public List<AttractionSpot> getSpot() {
		return spot;
	}

	public void setSpot(List<AttractionSpot> spot) {
		this.spot = spot;
	}

	public List<String> getSubLabel() {
		return subLabel;
	}

	public void setSubLabel(List<String> subLabel) {
		this.subLabel = subLabel;
	}

	public List<BasePOILabel> getSubLabelNew() {
		return subLabelNew;
	}

	public void setSubLabelNew(List<BasePOILabel> subLabelNew) {
		this.subLabelNew = subLabelNew;
	}

	public String getWrongCoverImage() {
		return wrongCoverImage;
	}

	public void setWrongCoverImage(String wrongCoverImage) {
		this.wrongCoverImage = wrongCoverImage;
	}

	public Object getPeriods() {
		return periods;
	}

	public void setPeriods(Object periods) {
		this.periods = periods;
	}

	public Object getScore() {
		return score;
	}

	public void setScore(Object score) {
		this.score = score;
	}

	public Object getCerateFlag() {
		return cerateFlag;
	}

	public void setCerateFlag(Object cerateFlag) {
		this.cerateFlag = cerateFlag;
	}

	public Object getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(Object priceLevel) {
		this.priceLevel = priceLevel;
	}

	public Object getUserCreateLabels() {
		return userCreateLabels;
	}

	public void setUserCreateLabels(Object userCreateLabels) {
		this.userCreateLabels = userCreateLabels;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Object getUnset() {
		return unset;
	}

	public void setUnset(Object unset) {
		this.unset = unset;
	}

	public Object getAreaName() {
		return areaName;
	}

	public void setAreaName(Object areaName) {
		this.areaName = areaName;
	}

	public Object getAreaIntroduce() {
		return areaIntroduce;
	}

	public void setAreaIntroduce(Object areaIntroduce) {
		this.areaIntroduce = areaIntroduce;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBriefIntroduce() {
		return briefIntroduce;
	}

	public void setBriefIntroduce(String briefIntroduce) {
		this.briefIntroduce = briefIntroduce;
	}

	public String getWrongCityName() {
		return wrongCityName;
	}

	public void setWrongCityName(String wrongCityName) {
		this.wrongCityName = wrongCityName;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

}
