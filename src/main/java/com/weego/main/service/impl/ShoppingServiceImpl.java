package com.weego.main.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weego.main.dao.ActivityDao;
import com.weego.main.dao.ShoppingDao;
import com.weego.main.dto.POIDetailActivitiesDto;
import com.weego.main.dto.POIDetailCommentsDto;
import com.weego.main.dto.POIDetailSumDto;
import com.weego.main.dto.POIDetailTagDto;
import com.weego.main.model.BasePOIComments;
import com.weego.main.model.ShopTag;
import com.weego.main.model.Shoppings;
import com.weego.main.service.ShoppingService;

@Service("shoppingService")
public class ShoppingServiceImpl implements ShoppingService {

	private static Logger logger = LogManager.getLogger(ShoppingServiceImpl.class);
	private String imageUrl = "http://weegotest.b0.upaiyun.com/shopping/iosimgs/";
	
	@Autowired
	ShoppingDao shoppingDao;
	@Autowired
	ActivityDao activityDao;


	@Override
	public POIDetailSumDto getShoppingById(String id, String coordination) {
		POIDetailSumDto poiDetailSumDto = new POIDetailSumDto();
		
		try {
			Shoppings shopping = shoppingDao.getShoppingById(id);
			if (shopping != null) {
				poiDetailSumDto.setId(shopping.getId());
				if(shopping.getType() == null) {
					poiDetailSumDto.setType(2);
				} else {
					poiDetailSumDto.setType(Integer.parseInt(shopping.getType()));
				}
				
				poiDetailSumDto.setName(shopping.getName());
				poiDetailSumDto.setNameEn(shopping.getNameEn());
				poiDetailSumDto.setAddress(shopping.getAddress());
				poiDetailSumDto.setTel(shopping.getTel());
				poiDetailSumDto.setWebsite(shopping.getUrl());
				poiDetailSumDto.setBriefIntroduction("");
				poiDetailSumDto.setIntroduction(shopping.getIntroduce());
				poiDetailSumDto.setCityName(shopping.getCityName());
				poiDetailSumDto.setCityId(shopping.getCityId());

				poiDetailSumDto.setImage(shopping.getImage());
				poiDetailSumDto.setCoverImage(imageUrl + shopping.getCoverImage());
				
				Object openTimes = shopping.getOpenTime();
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

				poiDetailSumDto.setPriceDesc(shopping.getPriceDesc());
				if(shopping.getRating() == null) {
					poiDetailSumDto.setRating(5.0);
				} else {
					poiDetailSumDto.setRating(Double.parseDouble(String.valueOf(shopping.getRating())));
				}
				
				/*List<POIDetailSpecialDto> poiDetailSpecialDtos = new ArrayList<POIDetailSpecialDto>();
				List<ShoppingBrand> shoppingBrands = shopping.getBrand();
				if (shoppingBrands != null && shoppingBrands.size() > 0) {
					for (ShoppingBrand shoppingBrand : shoppingBrands) {
						POIDetailSpecialDto poiDetailSpecialDto = new POIDetailSpecialDto();
						poiDetailSpecialDto.setId(shoppingBrand.getId());
						poiDetailSpecialDto.setAdvice("");
						poiDetailSpecialDto.setDesc(shoppingBrand.getDesc());
						poiDetailSpecialDto.setTitle(shoppingBrand.getTitle());
						poiDetailSpecialDto.setTag("");
						poiDetailSpecialDto.setCoverImage(imageUrl + shoppingBrand.getCoverImage());
						poiDetailSpecialDtos.add(poiDetailSpecialDto);
					}
				} else {
					poiDetailSpecialDtos = null;
				}
				
				if(shoppingBrands != null) {
					poiDetailSumDto.setSpecial(poiDetailSpecialDtos);
				} else {
					poiDetailSumDto.setSpecial(null);
				}*/
				
				poiDetailSumDto.setSpecial(null);
				
				List<POIDetailActivitiesDto> poiDetailActivitiesDtos = new ArrayList<POIDetailActivitiesDto>();
				poiDetailSumDto.setActivities(poiDetailActivitiesDtos);

				List<POIDetailTagDto> poiDetailTagDtos = new ArrayList<POIDetailTagDto>();
				List<ShopTag> basePOITags =	shopping.getShoptags();
				if (basePOITags != null && basePOITags.size() > 0) {
					int tagLimit = basePOITags.size();
					if (tagLimit > 3) {
						tagLimit = 3;
					}
					for (int i = 0; i < tagLimit; i++) {
						POIDetailTagDto poiDetailTagDto = new POIDetailTagDto();
						poiDetailTagDto.setId(basePOITags.get(i).getId());
						poiDetailTagDto.setName(basePOITags.get(i).getTitle());
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
				
				poiDetailSumDto.setTips(shopping.getTips());
				poiDetailSumDto.setCommentsUrl(shopping.getCommentsUrl());
				poiDetailSumDto.setCommentFrom(shopping.getCommentsFrom());

				List<POIDetailCommentsDto> poiDetailCommentsDtos = new ArrayList<POIDetailCommentsDto>();
				List<BasePOIComments> basePOIComments = shopping.getComments();
				if (basePOIComments != null && basePOIComments.size() > 0) {
					for (BasePOIComments basePOIComment : basePOIComments) {
						POIDetailCommentsDto poiDetailCommentsDto = new POIDetailCommentsDto();
						if(basePOIComment != null) {
							poiDetailCommentsDto.setNickname(basePOIComment.getNickname());
							poiDetailCommentsDto.setDate(null);
							poiDetailCommentsDto.setText(basePOIComment.getText());
							poiDetailCommentsDto.setRating(basePOIComment.getRating());
							poiDetailCommentsDto.setTitle(basePOIComment.getTitle());
							poiDetailCommentsDto.setLanguage(basePOIComment.getLanguage());
							poiDetailCommentsDtos.add(poiDetailCommentsDto);
						} else {
							poiDetailCommentsDtos = null;
						}
					}
				}
				if(basePOIComments != null) {
					poiDetailSumDto.setComments(poiDetailCommentsDtos);
				} else {
					poiDetailSumDto.setComments(null);
				}
				poiDetailSumDto.setOpenTableUrl("");
				poiDetailSumDto.setOpenDay(0);
				poiDetailSumDto.setFacilities(null);
			}
		} catch (Exception e) {
			logger.info("探索城市购物详情页出错!");
			e.printStackTrace();
		}
		return poiDetailSumDto;
	}

}
