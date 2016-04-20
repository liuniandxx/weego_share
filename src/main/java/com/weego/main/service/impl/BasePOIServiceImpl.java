package com.weego.main.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.weego.main.dto.POIDetailCommentsDto;
import com.weego.main.dto.POIDetailFacilitiesDto;
import com.weego.main.dto.POIDetailSpecialDto;
import com.weego.main.dto.POIDetailSumDto;
import com.weego.main.dto.POIDetailTagDto;
import com.weego.main.model.RestaurantInfo;
import com.weego.main.service.AreaService;
import com.weego.main.service.AttractionService;
import com.weego.main.service.BasePOIService;
import com.weego.main.service.RestaurantService;
import com.weego.main.service.ShoppingService;
import com.weego.main.util.HttpUtil;

@Service("basePOIService")
public class BasePOIServiceImpl implements BasePOIService {
	private String ATTRACTION_REQUEST_URL = "http://www.weegotr.com/api/v2/attractions_poi/";
	private String ATTRACTION_IMAGE_URL = "http://weegotest.b0.upaiyun.com/attractions/iosimgs/";

	private String RESTAURANT_REQUEST_URL = "http://www.weegotr.com/api/v2/restaurants_poi_new/";
	private String RESTAURANT_IMAGE_URL = "http://weegotest.b0.upaiyun.com/restaurant/iosimgs/";

	private String SHOPPING_REQUEST_URL = "http://www.weegotr.com/api/v2/shoppings_poi_new/";
	private String SHOPPING_IMAGE_URL = "http://weegotest.b0.upaiyun.com/shopping/iosimgs/";
	private String SHOPPING_BRAND_IMAGE_URL = "http://weegotest.b0.upaiyun.com/brands/iosimgs/";
	
	private String AREA_REQUEST_URL = "http://www.weegotr.com/api/v2/shopareas_poi/";
	private String AREA_IMAGE_URL = "http://weegotest.b0.upaiyun.com/shoparea/iosimgs/";

	private static Logger logger = LogManager.getLogger(BasePOIServiceImpl.class);

	@Autowired
	AttractionService attractionService;
	@Autowired
	RestaurantService restaurantService;
	@Autowired
	ShoppingService shoppingService;
	@Autowired
	AreaService areaService;

	/*
	 * public ModelAndView getPOIDetail2(String id, Integer type) { ModelAndView
	 * mv = null; POIDetailSumDto poiDetailSumDto = new POIDetailSumDto(); if
	 * (type == 0) { mv = new ModelAndView("POIspot"); poiDetailSumDto =
	 * attractionService.getAttractionById(id, "-73.9991637,40.7536854"); } else
	 * if (type == 1) { mv = new ModelAndView("POIfood"); poiDetailSumDto =
	 * restaurantService.getRestaurantById(id, "-73.9991637,40.7536854"); } else
	 * if (type == 2) { mv = new ModelAndView("POIshop"); poiDetailSumDto =
	 * shoppingService.getShoppingById(id, "-73.9991637,40.7536854"); } else if
	 * (type == 3) { mv = new ModelAndView("POIshop"); poiDetailSumDto =
	 * areaService.getAreaById(id, "-73.9991637,40.7536854"); } else {
	 * logger.info("type 参数值有误"); mv = null; poiDetailSumDto = null; }
	 * 
	 * if (poiDetailSumDto != null) { mv.addObject("type",
	 * poiDetailSumDto.getType()); mv.addObject("coverimage",
	 * poiDetailSumDto.getCoverImage()); mv.addObject("title",
	 * poiDetailSumDto.getName()); mv.addObject("english_title", "");
	 * mv.addObject("reviews", poiDetailSumDto.getRating());
	 * mv.addObject("foreword", poiDetailSumDto.getBriefIntroduction()); //
	 * 需要循环的tag mv.addObject("tags", poiDetailSumDto.getTag());
	 * 
	 * mv.addObject("breif", poiDetailSumDto.getIntroduction());
	 * mv.addObject("tips", poiDetailSumDto.getTips());
	 * 
	 * // 菜品推荐循环遍历 mv.addObject("recommends", poiDetailSumDto.getSpecial());
	 * 
	 * mv.addObject("commentFrom", poiDetailSumDto.getCommentFrom()); // 评论 if
	 * (poiDetailSumDto.getComments() != null &&
	 * poiDetailSumDto.getComments().size() > 0) { int size =
	 * poiDetailSumDto.getComments().size(); mv.addObject("comments",
	 * poiDetailSumDto.getComments().get(size - 1)); } else {
	 * mv.addObject("comments", null); }
	 * 
	 * // 后面一段 mv.addObject("price", poiDetailSumDto.getPriceDesc());
	 * mv.addObject("phone", poiDetailSumDto.getTel()); mv.addObject("web",
	 * poiDetailSumDto.getWebsite()); // 营业时间是列表形式的 mv.addObject("times",
	 * poiDetailSumDto.getOpenTime()); // 设施，需要循环遍历，传的是一个对象，里面的值是true or false
	 * mv.addObject("facilitie", poiDetailSumDto.getFacilities());
	 * 
	 * return mv; } else { logger.info("通过id找不到相应的POI"); return null; } }
	 */

	@Override
	public ModelAndView getPOIDetail(String id, Integer type) {
		ModelAndView mv = null;
		JSONObject json = null;
		if (type == 0) {
			mv = new ModelAndView("POIspot");
			mv.addObject("facilitie", new HashMap<Object, Object>());
			json = JSONObject.parseObject(HttpUtil.sendGet(ATTRACTION_REQUEST_URL, id, "poi"));
		} else if (type == 1) {
			mv = new ModelAndView("POIfood");
			json = JSONObject.parseObject(HttpUtil.sendGet(RESTAURANT_REQUEST_URL, id, "poi"));
		} else if (type == 2) {
			mv = new ModelAndView("POIshop");
			json = JSONObject.parseObject(HttpUtil.sendGet(SHOPPING_REQUEST_URL, id, "poi"));
		} else if (type == 3) {
			mv = new ModelAndView("POIshop");
			json = JSONObject.parseObject(HttpUtil.sendGet(AREA_REQUEST_URL, id, "poi"));
		} else {
			logger.info("type 参数值有误");
			return null;
		}

		if (json != null) {
			mv.addObject("type", type);
			mv.addObject("coverimage",getCoverImage(type, (String) json.get("cover_image")));
			mv.addObject("title", json.get("name"));
			mv.addObject("english_title", "");
			mv.addObject("reviews", json.get("rating"));
			mv.addObject("foreword", json.get("brief_introduce"));

			// 需要循环的tag
			if(type == 0) {
				mv.addObject("tags",getAttractionAndShoppingTags(type, (List<Map<String, Object>>) json.get("category")));
			} else if(type == 1) {
				mv.addObject("tags",getRestaurantAndAreaTags(type, (List<String>) json.get("tags_zh")));
			} else if(type == 2) {
				mv.addObject("tags",getAttractionAndShoppingTags(type, (List<Map<String, Object>>) json.get("category")));
			} else if(type == 3) {
				mv.addObject("tags",getRestaurantAndAreaTags(type, (List<String>) json.get("tags")));
			}
			
			mv.addObject("breif", json.get("introduce"));
			mv.addObject("tips", json.get("tips"));

			// 菜品推荐循环遍历
			String special = "";
			if (type == 0) {
				special = "spot";
			} else if (type == 1) {
				special = "menu";
			} else if (type == 2) {
				special = "brand";
			} else if (type == 3) {
				special = "";
			}
			mv.addObject("recommends",getSpecials(type, (List<Map<String, Object>>) json.get(special)));
			
			mv.addObject("commentFrom", json.get("comments_from"));
			// 评论
			try {
				mv.addObject("comments",getComments(type, (List<Map<String, Object>>) json.get("comments")));
			} catch(Exception e) {
				mv.addObject("comments", null);
				logger.info("评论有脏数据");
			}

			// 后面一段
			mv.addObject("price", json.get("price_desc"));
			mv.addObject("phone", json.get("tel"));
			mv.addObject("web", json.get("website"));

			// 营业时间是列表形式的
			mv.addObject("times",getOpenTime(type, (List<Map<String, Object>>) json.get("open_time")));

			// 设施，需要循环遍历，传的是一个对象，里面的值是true or false
			if(type == 0 || type == 2 || type == 3) {
				mv.addObject("facilitie", new HashMap<Object, Object>());
			} else {
				mv.addObject("facilitie", getFacilitie((Map<String, Object>) json.get("info")));
			}
				
			return mv;
		} else {
			logger.info("通过id找不到相应的POI");
			return null;
		}
	}

	private String getCoverImage(Integer type, String obj) {
		if (type == 0) {
			return ATTRACTION_IMAGE_URL + obj;
		} else if (type == 1) {
			return RESTAURANT_IMAGE_URL + obj;
		} else if (type == 2) {
			return SHOPPING_IMAGE_URL + obj;
		} else if (type == 3) {
			return AREA_IMAGE_URL + obj;
		}
		return null;
	}

	private List<POIDetailTagDto> getAttractionAndShoppingTags(Integer type,
			List<Map<String, Object>> obj) {
		if (type == 0) {
			List<POIDetailTagDto> newTags = new ArrayList<POIDetailTagDto>();
			if (obj != null && obj.size() > 0) {
				int limit = obj.size();
				if(limit > 3) {
					limit = 3;
				}
				for (int i = 0; i < limit ; i++) {
					POIDetailTagDto poiTagDto = new POIDetailTagDto();
					poiTagDto.setId((String) obj.get(i).get("_id"));
					poiTagDto.setName((String) obj.get(i).get("name"));
					newTags.add(poiTagDto);
				}
			} else {
				newTags = null;
			}
			return newTags;
		}
		return null;
	}
	
	private List<POIDetailTagDto> getRestaurantAndAreaTags(Integer type, List<String> obj) {
		if (type == 1 || type == 3 ) {
			List<POIDetailTagDto> newTags = new ArrayList<POIDetailTagDto>();
			if (obj != null && obj.size() > 0) {
				int limit = obj.size();
				if(limit > 3) {
					limit = 3;
				}
				for (int i = 0; i < limit; i++) {
					POIDetailTagDto poiTagDto = new POIDetailTagDto();
					poiTagDto.setId("");
					poiTagDto.setName(obj.get(i));
					newTags.add(poiTagDto);
				}
			} else {
				newTags = null;
			}
			return newTags;
		}
		return null;
	}

	private List<POIDetailSpecialDto> getSpecials(Integer type, List<Map<String, Object>> obj) {
		List<POIDetailSpecialDto> poiDetailSpecialDtos = new ArrayList<POIDetailSpecialDto>();
		if (obj != null && obj.size() > 0) {
			for (int i = 0; i < obj.size(); i++) {
				POIDetailSpecialDto poiDetailSpecialDto = new POIDetailSpecialDto();
				poiDetailSpecialDto.setId("");
				poiDetailSpecialDto.setAdvice((String) obj.get(i).get("advice"));
				poiDetailSpecialDto.setDesc((String) obj.get(i).get("desc"));
				poiDetailSpecialDto.setTitle((String) obj.get(i).get("title"));
				poiDetailSpecialDto.setTag("");
				String coverImagePath = "";
				if (type == 0) {
					coverImagePath = ATTRACTION_IMAGE_URL;
				} else if (type == 1) {
					coverImagePath = RESTAURANT_IMAGE_URL;
				} else if (type == 2) {
					coverImagePath = SHOPPING_BRAND_IMAGE_URL;
				} else if (type == 3) {
					coverImagePath = AREA_IMAGE_URL;
				}
				poiDetailSpecialDto.setCoverImage(coverImagePath + (String) obj.get(i).get("cover_image"));
				poiDetailSpecialDtos.add(poiDetailSpecialDto);
			}
		} else {
			poiDetailSpecialDtos = null;
		}
		return poiDetailSpecialDtos;
	}

	private POIDetailCommentsDto getComments(Integer type, List<Map<String, Object>> obj) {
		List<POIDetailCommentsDto> poiDetailCommentsDtos = new ArrayList<POIDetailCommentsDto>();
		if (obj != null && obj.size() > 0) {
			for (int i = 0; i < obj.size(); i++) {
				POIDetailCommentsDto poiDetailCommentsDto = new POIDetailCommentsDto();
				poiDetailCommentsDto.setNickname((String) obj.get(i).get("nickname"));
				poiDetailCommentsDto.setDate((String) obj.get(i).get("date"));
				poiDetailCommentsDto.setText((String) obj.get(i).get("text"));
				if (obj.get(i).get("rating") instanceof Integer) {
					poiDetailCommentsDto.setRating((Integer) obj.get(i).get("rating"));
				} else if (obj.get(i).get("rating") instanceof String) {
					if (obj.get(i).get("rating") != null && obj.get(i).get("rating") != "") {
						poiDetailCommentsDto.setRating(Integer.parseInt((String) obj.get(i).get("rating")));
					} else {
						poiDetailCommentsDto.setRating(5);
					}
				} else {
					poiDetailCommentsDto.setRating(5);
				}
				
				String title = (String) obj.get(i).get("title");
				if(title == null || "".equals(title)) {
					poiDetailCommentsDto.setTitle((String) obj.get(i).get("nickname"));
				} else {
					poiDetailCommentsDto.setTitle(title);
				}
				poiDetailCommentsDto.setLanguage("");
				poiDetailCommentsDtos.add(poiDetailCommentsDto);
			}
		}
		if (poiDetailCommentsDtos != null && poiDetailCommentsDtos.size() > 0) {
			return poiDetailCommentsDtos.get(0);
		}
		return null;
	}

	private List<String> getOpenTime(Integer type, List<Map<String, Object>> obj) {
		List<String> openTimeDesc = new ArrayList<String>();
		if (obj != null && obj.size() > 0) {
			for (int i = 0; i < obj.size(); i++) {
				openTimeDesc.add((String) obj.get(i).get("desc"));
			}
		} else {
			openTimeDesc = null;
		}
		return openTimeDesc;
	}
	
	private POIDetailFacilitiesDto getFacilitie(Map<String, Object> obj) {
		POIDetailFacilitiesDto poiDetailFacilitiesDto = new POIDetailFacilitiesDto();
		if (obj != null && obj.size() > 0) {
			poiDetailFacilitiesDto.setAlcohol((String) obj.get("alcohol"));
			poiDetailFacilitiesDto.setNoise((String) obj.get("noise"));
			poiDetailFacilitiesDto.setWaiter((Boolean) obj.get("waiter"));
			poiDetailFacilitiesDto.setTv((Boolean) obj.get("tv"));
			poiDetailFacilitiesDto.setOutseat((Boolean) obj.get("out_seat"));
			poiDetailFacilitiesDto.setGroup((Boolean) obj.get("g_f_group"));
			poiDetailFacilitiesDto.setKid((Boolean) obj.get("g_f_kid"));
			poiDetailFacilitiesDto.setCard((Boolean) obj.get("card"));
			poiDetailFacilitiesDto.setTakeout((Boolean) obj.get("take_out"));
			poiDetailFacilitiesDto.setDelivery((Boolean) obj.get("delivery"));
			poiDetailFacilitiesDto.setReserve((Boolean) obj.get("yu_ding"));
			poiDetailFacilitiesDto.setWifi((Boolean) obj.get("wifi"));
		} else {
			poiDetailFacilitiesDto = null;
		}
		return poiDetailFacilitiesDto;
	}
}
