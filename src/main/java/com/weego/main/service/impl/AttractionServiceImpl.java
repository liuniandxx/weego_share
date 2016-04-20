package com.weego.main.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weego.main.dao.ActivityDao;
import com.weego.main.dao.AttractionDao;
import com.weego.main.dto.POIDetailActivitiesDto;
import com.weego.main.dto.POIDetailCommentsDto;
import com.weego.main.dto.POIDetailSpecialDto;
import com.weego.main.dto.POIDetailSumDto;
import com.weego.main.dto.POIDetailTagDto;
import com.weego.main.model.AttractionSpot;
import com.weego.main.model.BasePOIComments;
import com.weego.main.model.BasePOILabel;
import com.weego.main.model.LatestAttractions;
import com.weego.main.service.AttractionService;

@Service("attractionService")
public class AttractionServiceImpl implements AttractionService {

	private static Logger logger = LogManager
			.getLogger(AttractionServiceImpl.class);
	private String imageUrl = "http://weegotest.b0.upaiyun.com/attractions/iosimgs/";

	@Autowired
	AttractionDao attractionDao;

	@Autowired
	ActivityDao activityDao;

	@Override
	public POIDetailSumDto getAttractionById(String id, String coordination) {
		POIDetailSumDto poiDetailSumDto = new POIDetailSumDto();

		try {
			LatestAttractions attraction = attractionDao.getAttractionById(id);
			if (attraction != null) {
				poiDetailSumDto.setId(attraction.getId());
				if (attraction.getType() == null) {
					poiDetailSumDto.setType(0);
				} else {
					poiDetailSumDto.setType(Integer.parseInt(attraction
							.getType()));
				}
				poiDetailSumDto.setName(attraction.getAttractions());
				poiDetailSumDto.setNameEn(attraction.getAttractionsEn());
				poiDetailSumDto.setAddress(attraction.getAddress());
				poiDetailSumDto.setTel(attraction.getTelno());
				poiDetailSumDto.setWebsite(attraction.getWebsite());
				poiDetailSumDto.setBriefIntroduction(attraction
						.getShortIntroduce());
				poiDetailSumDto.setIntroduction(attraction.getIntroduce());
				poiDetailSumDto.setCityName(attraction.getCityName());
				poiDetailSumDto.setCityId(attraction.getCityId());

				poiDetailSumDto.setImage(attraction.getImage());
				poiDetailSumDto.setCoverImage(imageUrl + attraction.getCoverImageName());

				Object openTimes = attraction.getOpenTime();
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

				poiDetailSumDto.setOpenTimeDesc("");
				poiDetailSumDto.setPriceDesc(attraction.getPrice());

				if (attraction.getYelpRating() == null) {
					poiDetailSumDto.setRating(5.0);
				} else {
					poiDetailSumDto.setRating(Double.valueOf(String.valueOf(attraction.getYelpRating())));
				}

				List<POIDetailSpecialDto> poiDetailSpecialDtos = new ArrayList<POIDetailSpecialDto>();
				List<AttractionSpot> attractionSpots = attraction.getSpot();
				if (attractionSpots != null && attractionSpots.size() > 0) {
					for (AttractionSpot attractionSpot : attractionSpots) {
						POIDetailSpecialDto poiDetailSpecialDto = new POIDetailSpecialDto();
						poiDetailSpecialDto.setId("");
						poiDetailSpecialDto.setAdvice(attractionSpot.getAdvice());
						poiDetailSpecialDto.setDesc(attractionSpot.getDesc());
						poiDetailSpecialDto.setTitle(attractionSpot.getTitle());
						poiDetailSpecialDto.setTag("");
						poiDetailSpecialDto.setCoverImage(imageUrl + attractionSpot.getCoverImage());
						poiDetailSpecialDtos.add(poiDetailSpecialDto);
					} 
				} else {
					poiDetailSpecialDtos = null;
				}
				
				if (attractionSpots != null) {
					poiDetailSumDto.setSpecial(poiDetailSpecialDtos);
				} else {
					poiDetailSumDto.setSpecial(null);
				}

				List<POIDetailActivitiesDto> poiDetailActivitiesDtos = new ArrayList<POIDetailActivitiesDto>();
				poiDetailSumDto.setActivities(poiDetailActivitiesDtos);

				List<POIDetailTagDto> poiDetailTagDtos = new ArrayList<POIDetailTagDto>();
				List<BasePOILabel> basePOITags = attraction.getSubLabelNew();
				if (basePOITags != null && basePOITags.size() > 0) {
					int tagLimit = basePOITags.size();
					if (tagLimit > 3) {
						tagLimit = 3;
					}
					for (int i = 0; i < tagLimit; i++) {
						POIDetailTagDto poiDetailTagDto = new POIDetailTagDto();
						poiDetailTagDto.setId(basePOITags.get(i).getId());
						poiDetailTagDto.setName(basePOITags.get(i).getLabel());
						poiDetailTagDtos.add(poiDetailTagDto);
					}
				} else {
					poiDetailTagDtos = null;
				}
				poiDetailSumDto.setTag(poiDetailTagDtos);

				poiDetailSumDto.setTips(attraction.getTips());
				poiDetailSumDto.setCommentsUrl(attraction.getCommentsUrl());
				poiDetailSumDto.setCommentFrom(attraction.getCommentsFrom());

				List<POIDetailCommentsDto> poiDetailCommentsDtos = new ArrayList<POIDetailCommentsDto>();
				List<BasePOIComments> basePOIComments = attraction.getComments();
				if (basePOIComments != null && basePOIComments.size() > 0) {
					for (BasePOIComments basePOIComment : basePOIComments) {
						POIDetailCommentsDto poiDetailCommentsDto = new POIDetailCommentsDto();
						poiDetailCommentsDto.setNickname(basePOIComment.getNickname());
						poiDetailCommentsDto.setDate(null);
						poiDetailCommentsDto.setText(basePOIComment.getText());
						poiDetailCommentsDto.setRating(basePOIComment.getRating());
						poiDetailCommentsDto.setTitle(basePOIComment.getTitle());
						poiDetailCommentsDto.setLanguage(basePOIComment.getLanguage());
						poiDetailCommentsDtos.add(poiDetailCommentsDto);
					}
				} else {
					poiDetailCommentsDtos = null;
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
			logger.info("探索城市景点详情页接口出错!");
			e.printStackTrace();
		}
		return poiDetailSumDto;
	}

}
