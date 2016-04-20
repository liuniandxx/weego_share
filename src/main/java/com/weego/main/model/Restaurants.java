package com.weego.main.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongojack.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Restaurants {
	@Id
	private String id;

	@JsonProperty("__v")
	private Integer version;

	private String address;

	private Boolean am;

	@JsonProperty("brief_introduce")
	private String briefIntroduce;

	private List<ObjectId> categories;

	private List<RestaurantCategory> category;

	@JsonProperty("city_id")
	private String cityId;

	@JsonProperty("city_name")
	private String cityName;

	@JsonProperty("city name")
	private String wrongCityName;

	private List<Object> comments;

	@JsonProperty("comments_from")
	private String commentsFrom;

	@JsonProperty("comments_top")
	private List<BasePOICommentsTop> commentsTop;

	@JsonProperty("comments_url")
	private String commentsUrl;

	@JsonProperty("cover_image")
	private String coverImage;

	@JsonProperty("create_at")
	private Date createAt;

	@JsonProperty("data_invalid")
	private Boolean dataInvalid;

	private Integer duration;

	@JsonProperty("en_info")
	private Object enInfo;

	private Boolean ev;

	private String googleId;

	private List<String> image;

	@JsonProperty("image_url")
	private List<BasePOIImageUrl> imageUrl;

	private Boolean imgFlag;

	@JsonProperty("index_flag")
	private String indexFlag;

	private RestaurantInfo info;

	private String introduce;

	private String latitude;

	private List<RestaurantCategory> lifetag;

	private List<Double> loc;

	private String longitude;

	private List<RestaurantDish> menu;

	private String name;

	@JsonProperty("name_en")
	private String nameEn;

	@JsonProperty("openTable_url")
	private String openTabelUrl;

	@JsonProperty("open_time")
	private Object openTime;

	private List<BasePOIPeriods> periods;

	private Boolean pm;

	@JsonProperty("price_desc")
	private String priceDesc;

	@JsonProperty("price_level")
	private Object priceLevel;

	private Integer ranking;

	private Object rating;

	@JsonProperty("rating_env")
	private Integer ratingEnv;

	@JsonProperty("rating_food")
	private Integer ratingFood;

	@JsonProperty("rating_service")
	private Integer ratingService;

	@JsonProperty("recommand_reason")
	private String recommandReason;

	@JsonProperty("recommand_duration")
	private String recommandDuration;

	@JsonProperty("recommand_flag")
	private String recommandFlag;

	private List<RestaurantResTags> restags;

	private Integer reviews;

	private Integer score;

	@JsonProperty("show_flag")
	private Boolean showFlag;

	private Object tags;

	@JsonProperty("tags_zh")
	private List<String> tagsZh;

	private String tel;

	private String tips;

	private String type;

	private String url;

	private String website;

	@JsonProperty("comments_zh")
	private List<String> commentsZh;

	@JsonProperty("postal_code")
	private String postalCode;

	@JsonProperty("local_flag")
	private Boolean localFlag;

	@JsonProperty("michilin_flag")
	private Boolean michiFlag;

	@JsonProperty("michelin_flag")
	private Boolean wrongMichiFlag;

	@JsonProperty("area_id")
	private String areaId;

	@JsonProperty("area_name")
	private String areaName;

	@JsonProperty("yelp_img_url")
	private String yelpImgUrl;

	@JsonProperty("field14")
	private String field;

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

	public String getBriefIntroduce() {
		return briefIntroduce;
	}

	public void setBriefIntroduce(String briefIntroduce) {
		this.briefIntroduce = briefIntroduce;
	}

	public List<ObjectId> getCategories() {
		return categories;
	}

	public void setCategories(List<ObjectId> categories) {
		this.categories = categories;
	}

	public List<RestaurantCategory> getCategory() {
		return category;
	}

	public void setCategory(List<RestaurantCategory> category) {
		this.category = category;
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

	public List<Object> getComments() {
		return comments;
	}

	public void setComments(List<Object> comments) {
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

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
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

	public String getWrongCityName() {
		return wrongCityName;
	}

	public void setWrongCityName(String wrongCityName) {
		this.wrongCityName = wrongCityName;
	}

	public Object getEnInfo() {
		return enInfo;
	}

	public void setEnInfo(Object enInfo) {
		this.enInfo = enInfo;
	}

	public Boolean getMichiFlag() {
		return michiFlag;
	}

	public void setMichiFlag(Boolean michiFlag) {
		this.michiFlag = michiFlag;
	}

	public Boolean getWrongMichiFlag() {
		return wrongMichiFlag;
	}

	public void setWrongMichiFlag(Boolean wrongMichiFlag) {
		this.wrongMichiFlag = wrongMichiFlag;
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

	public RestaurantInfo getInfo() {
		return info;
	}

	public void setInfo(RestaurantInfo info) {
		this.info = info;
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

	public List<RestaurantCategory> getLifetag() {
		return lifetag;
	}

	public void setLifetag(List<RestaurantCategory> lifetag) {
		this.lifetag = lifetag;
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

	public List<RestaurantDish> getMenu() {
		return menu;
	}

	public void setMenu(List<RestaurantDish> menu) {
		this.menu = menu;
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

	public String getOpenTabelUrl() {
		return openTabelUrl;
	}

	public void setOpenTabelUrl(String openTabelUrl) {
		this.openTabelUrl = openTabelUrl;
	}

	public Object getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Object openTime) {
		this.openTime = openTime;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getYelpImgUrl() {
		return yelpImgUrl;
	}

	public void setYelpImgUrl(String yelpImgUrl) {
		this.yelpImgUrl = yelpImgUrl;
	}

	public List<BasePOIPeriods> getPeriods() {
		return periods;
	}

	public void setPeriods(List<BasePOIPeriods> periods) {
		this.periods = periods;
	}

	public Boolean getPm() {
		return pm;
	}

	public void setPm(Boolean pm) {
		this.pm = pm;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public Object getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(Object priceLevel) {
		this.priceLevel = priceLevel;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public Object getRating() {
		return rating;
	}

	public void setRating(Object rating) {
		this.rating = rating;
	}

	public Integer getRatingEnv() {
		return ratingEnv;
	}

	public void setRatingEnv(Integer ratingEnv) {
		this.ratingEnv = ratingEnv;
	}

	public Integer getRatingFood() {
		return ratingFood;
	}

	public void setRatingFood(Integer ratingFood) {
		this.ratingFood = ratingFood;
	}

	public Integer getRatingService() {
		return ratingService;
	}

	public void setRatingService(Integer ratingService) {
		this.ratingService = ratingService;
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

	public List<RestaurantResTags> getRestags() {
		return restags;
	}

	public void setRestags(List<RestaurantResTags> restags) {
		this.restags = restags;
	}

	public Integer getReviews() {
		return reviews;
	}

	public void setReviews(Integer reviews) {
		this.reviews = reviews;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Boolean getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(Boolean showFlag) {
		this.showFlag = showFlag;
	}

	public Object getTags() {
		return tags;
	}

	public void setTags(Object tags) {
		this.tags = tags;
	}

	public List<String> getTagsZh() {
		return tagsZh;
	}

	public void setTagsZh(List<String> tagsZh) {
		this.tagsZh = tagsZh;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<String> getCommentsZh() {
		return commentsZh;
	}

	public void setCommentsZh(List<String> commentsZh) {
		this.commentsZh = commentsZh;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getRecommandReason() {
		return recommandReason;
	}

	public void setRecommandReason(String recommandReason) {
		this.recommandReason = recommandReason;
	}

	public Boolean getLocalFlag() {
		return localFlag;
	}

	public void setLocalFlag(Boolean localFlag) {
		this.localFlag = localFlag;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

}
