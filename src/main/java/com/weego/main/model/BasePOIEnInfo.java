package com.weego.main.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasePOIEnInfo {
	private String introduce;
	private String opentime;
	private String price;

	@JsonProperty("recommand_reason")
	private String recommandReason;

	@JsonProperty("short_introduce")
	private String shortIntroduce;

	@JsonProperty("brief_introduce")
	private String briefIntroduce;

	@JsonProperty("price_desc")
	private String priceDesc;

	@JsonProperty("open_time")
	private List<String> openTimeArray;

	private List<String> comments;

	private String tips;

	@JsonProperty("traffic_info")
	private String trafficInfo;

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRecommandReason() {
		return recommandReason;
	}

	public void setRecommandReason(String recommandReason) {
		this.recommandReason = recommandReason;
	}

	public String getShortIntroduce() {
		return shortIntroduce;
	}

	public void setShortIntroduce(String shortIntroduce) {
		this.shortIntroduce = shortIntroduce;
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

	public String getBriefIntroduce() {
		return briefIntroduce;
	}

	public void setBriefIntroduce(String briefIntroduce) {
		this.briefIntroduce = briefIntroduce;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public List<String> getOpenTimeArray() {
		return openTimeArray;
	}

	public void setOpenTimeArray(List<String> openTimeArray) {
		this.openTimeArray = openTimeArray;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

}
