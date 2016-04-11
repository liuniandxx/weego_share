package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestaurantInfo {
	private String alcohol;
	private boolean card;
	private boolean delivery;
	private String noise;
	private boolean waiter;
	private boolean tv;

	@JsonProperty("out_seat")
	private boolean outseat;

	@JsonProperty("g_f_group")
	private boolean group;

	@JsonProperty("g_for")
	private String gFor;

	@JsonProperty("g_f_kid")
	private boolean kid;

	@JsonProperty("take_out")
	private boolean takeout;

	@JsonProperty("yu_ding")
	private boolean reserve;
	private boolean wifi;

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public boolean isWaiter() {
		return waiter;
	}

	public void setWaiter(boolean waiter) {
		this.waiter = waiter;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean isOutseat() {
		return outseat;
	}

	public void setOutseat(boolean outseat) {
		this.outseat = outseat;
	}

	public boolean isGroup() {
		return group;
	}

	public void setGroup(boolean group) {
		this.group = group;
	}

	public boolean isKid() {
		return kid;
	}

	public void setKid(boolean kid) {
		this.kid = kid;
	}

	public boolean isCard() {
		return card;
	}

	public void setCard(boolean card) {
		this.card = card;
	}

	public boolean isTakeout() {
		return takeout;
	}

	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	public boolean isReserve() {
		return reserve;
	}

	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public String getgFor() {
		return gFor;
	}

	public void setgFor(String gFor) {
		this.gFor = gFor;
	}

}
