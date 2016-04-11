package com.weego.main.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weego.main.dao.ActivityDao;
import com.weego.main.dao.RestaurantDao;
import com.weego.main.dto.POIDetailActivitiesDto;
import com.weego.main.dto.POIDetailCommentsDto;
import com.weego.main.dto.POIDetailFacilitiesDto;
import com.weego.main.dto.POIDetailSpecialDto;
import com.weego.main.dto.POIDetailSumDto;
import com.weego.main.dto.POIDetailTagDto;
import com.weego.main.model.RestaurantDish;
import com.weego.main.model.RestaurantInfo;
import com.weego.main.model.Restaurants;
import com.weego.main.service.RestaurantService;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {

	private static Logger logger = LogManager.getLogger(RestaurantServiceImpl.class);
	private String imageUrl = "http://weegotest.b0.upaiyun.com/restaurant/iosimgs/";

	@Autowired
	RestaurantDao restaurantDao;
	@Autowired
	ActivityDao activityDao;

	@Override
	public POIDetailSumDto getRestaurantById(String id, String coordination) {
		POIDetailSumDto poiDetailSumDto = new POIDetailSumDto();

		try {
			Restaurants restaurant = restaurantDao.getRestaurantById(id);
			if (restaurant != null) {
				poiDetailSumDto.setId(restaurant.getId());
				if(restaurant.getType() == null) {
					poiDetailSumDto.setType(1);
				} else {
					poiDetailSumDto.setType(Integer.parseInt(restaurant.getType()));
				}
				
				poiDetailSumDto.setName(restaurant.getName());
				poiDetailSumDto.setNameEn(restaurant.getNameEn());
				poiDetailSumDto.setAddress(restaurant.getAddress());
				poiDetailSumDto.setTel(restaurant.getTel());
				poiDetailSumDto.setWebsite(restaurant.getWebsite());
				poiDetailSumDto.setBriefIntroduction(restaurant.getBriefIntroduce());
				poiDetailSumDto.setIntroduction(restaurant.getIntroduce());
				poiDetailSumDto.setCityName(restaurant.getCityName());
				poiDetailSumDto.setCityId(restaurant.getCityId());

				poiDetailSumDto.setImage(restaurant.getImage());
				poiDetailSumDto.setCoverImage(imageUrl + restaurant.getCoverImage());

				Object openTimes = restaurant.getOpenTime();
				List<String> openTimeDesc = new ArrayList<String>();
				if (openTimes instanceof String) {
					openTimeDesc.add((String) openTimes);
				} else if (openTimes instanceof List) {
					List<Map<String, String>> tempOpenTimes = (List<Map<String, String>>) openTimes;
					if (tempOpenTimes != null && tempOpenTimes.size() > 0) {
						for (Map<String, String> tempOpenTime : tempOpenTimes) {
							openTimeDesc.add(tempOpenTime.get("desc"));
						}
					} else {
						openTimeDesc = null;
					}
				}

				if (openTimes != null) {
					poiDetailSumDto.setOpenTime(openTimeDesc);
				} else {
					poiDetailSumDto.setOpenTime(null);
				}

				poiDetailSumDto.setPriceDesc(restaurant.getPriceDesc());
				if(restaurant.getRating() == null) {
					poiDetailSumDto.setRating(5.0);
				} else {
					poiDetailSumDto.setRating(Double.parseDouble(String.valueOf(restaurant.getRating())));
				}
				
				List<POIDetailSpecialDto> poiDetailSpecialDtos = new ArrayList<POIDetailSpecialDto>();
				List<RestaurantDish> restaurantDishs = restaurant.getMenu();
				if (restaurantDishs != null && restaurantDishs.size() > 0) {
					for (RestaurantDish restaurantDish : restaurantDishs) {
						POIDetailSpecialDto poiDetailSpecialDto = new POIDetailSpecialDto();
						poiDetailSpecialDto.setId("");
						poiDetailSpecialDto.setAdvice(restaurantDish.getAdvice());
						poiDetailSpecialDto.setDesc(restaurantDish.getDesc());
						poiDetailSpecialDto.setTitle("");
						poiDetailSpecialDto.setTag("");
						poiDetailSpecialDto.setCoverImage(imageUrl + restaurantDish.getCoverImage());
						poiDetailSpecialDtos.add(poiDetailSpecialDto);
					}
				} else {
					poiDetailSpecialDtos = null;
				}
				
				if(restaurantDishs != null) {
					poiDetailSumDto.setSpecial(poiDetailSpecialDtos);
				} else {
					poiDetailSumDto.setSpecial(null);
				}
				
				List<POIDetailActivitiesDto> poiDetailActivitiesDtos = new ArrayList<POIDetailActivitiesDto>();
				poiDetailSumDto.setActivities(poiDetailActivitiesDtos);

				List<POIDetailTagDto> poiDetailTagDtos = new ArrayList<POIDetailTagDto>();
				List<String> basePOITags = restaurant.getTagsZh();
				if (basePOITags != null && basePOITags.size() > 0) {
					int tagLimit = basePOITags.size();
					if (tagLimit > 3) {
						tagLimit = 3;
					}
					for (int i = 0; i < tagLimit; i++) {
						POIDetailTagDto poiDetailTagDto = new POIDetailTagDto();
						poiDetailTagDto.setId("");
						poiDetailTagDto.setName(basePOITags.get(i));
						poiDetailTagDtos.add(poiDetailTagDto);
					}
				} else {
					poiDetailTagDtos = null;
				}
				if(basePOITags != null) {
					poiDetailSumDto.setTag(poiDetailTagDtos);
				} else {
					poiDetailSumDto.setTag(null);
				}
				
				poiDetailSumDto.setTips(restaurant.getTips());
				poiDetailSumDto.setCommentsUrl(restaurant.getCommentsUrl());
				poiDetailSumDto.setCommentFrom(restaurant.getCommentsFrom());

				List<POIDetailCommentsDto> poiDetailCommentsDtos = new ArrayList<POIDetailCommentsDto>();
				List<Object> comments = restaurant.getComments();
				if (comments != null && comments.size() > 0) {
					if (comments.get(0) instanceof String) {
						poiDetailSumDto.setComments(null);
					} else if (comments.get(0) instanceof Map) {
						for (int i = 0; i < comments.size(); i++) {
							Map<String, Object> comment = (HashMap<String, Object>) comments.get(i);
							POIDetailCommentsDto poiDetailCommentsDto = new POIDetailCommentsDto();
							poiDetailCommentsDto.setNickname((String) comment.get("nickname"));
							poiDetailCommentsDto.setDate((String) comment.get("date"));
							poiDetailCommentsDto.setText((String) comment.get("text"));
							poiDetailCommentsDto.setRating((Integer) comment.get("rating"));
							poiDetailCommentsDto.setTitle((String) comment.get("title"));
							poiDetailCommentsDto.setLanguage((String) comment.get("language"));
							poiDetailCommentsDtos.add(poiDetailCommentsDto);
						}
						poiDetailSumDto.setComments(poiDetailCommentsDtos);
					}
				} else {
					poiDetailSumDto.setComments(null);
				}

				poiDetailSumDto.setOpenTableUrl(restaurant.getOpenTabelUrl());
				poiDetailSumDto.setOpenDay(0);

				POIDetailFacilitiesDto poiDetailFacilitiesDto = new POIDetailFacilitiesDto();
				RestaurantInfo restaurantFacilities = restaurant.getInfo();
				if (restaurantFacilities != null) {
					poiDetailFacilitiesDto.setAlcohol(restaurantFacilities
							.getAlcohol());
					poiDetailFacilitiesDto.setNoise(restaurantFacilities
							.getNoise());
					poiDetailFacilitiesDto.setWaiter(restaurantFacilities
							.isWaiter());
					poiDetailFacilitiesDto.setTv(restaurantFacilities.isTv());
					poiDetailFacilitiesDto.setOutseat(restaurantFacilities
							.isOutseat());
					poiDetailFacilitiesDto.setGroup(restaurantFacilities
							.isGroup());
					poiDetailFacilitiesDto.setKid(restaurantFacilities.isKid());
					poiDetailFacilitiesDto.setCard(restaurantFacilities
							.isCard());
					poiDetailFacilitiesDto.setTakeout(restaurantFacilities
							.isTakeout());
					poiDetailFacilitiesDto.setDelivery(restaurantFacilities
							.isDelivery());
					poiDetailFacilitiesDto.setReserve(restaurantFacilities
							.isReserve());
					poiDetailFacilitiesDto.setWifi(restaurantFacilities
							.isWifi());
				}
				
				if(restaurantFacilities != null) {
					poiDetailSumDto.setFacilities(poiDetailFacilitiesDto);
				} else {
					poiDetailSumDto.setFacilities(null);
				}
			}
		} catch (Exception e) {
			logger.info("探索城市餐厅详情页出错!");
			e.printStackTrace();
		}
		return poiDetailSumDto;
	}
}
