package com.weego.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weego.main.dao.ActivityDao;
import com.weego.main.dao.AreaDao;
import com.weego.main.dto.POIDetailActivitiesDto;
import com.weego.main.dto.POIDetailCommentsDto;
import com.weego.main.dto.POIDetailSumDto;
import com.weego.main.dto.POIDetailTagDto;
import com.weego.main.model.Areas;
import com.weego.main.model.BasePOIComments;
import com.weego.main.service.AreaService;

@Service("areaService")
public class AreaServiceImpl implements AreaService {

	private static Logger logger = LogManager.getLogger(AreaServiceImpl.class);
	private String imageUrl = "http://weegotest.b0.upaiyun.com/shoparea/iosimgs/";
	
	@Autowired
	AreaDao areaDao;
	
	@Autowired
	ActivityDao activityDao;


	@Override
	public POIDetailSumDto getAreaById(String id, String coordination) {
		POIDetailSumDto poiDetailSumDto = new POIDetailSumDto();
		
		try {
			Areas area = areaDao.getAreaById(id);
			if (area != null) {
				poiDetailSumDto.setId(area.getId());
				poiDetailSumDto.setType(Integer.parseInt(area.getType()));
				poiDetailSumDto.setName(area.getAreaName());
				poiDetailSumDto.setNameEn(area.getAreaEnName());
				poiDetailSumDto.setAddress(area.getAddress());
				poiDetailSumDto.setTel(area.getTel());
				poiDetailSumDto.setWebsite(area.getWebsite());
				poiDetailSumDto.setBriefIntroduction("");
				poiDetailSumDto.setIntroduction(area.getIntroduce());
				poiDetailSumDto.setCityName(area.getCityName());
				poiDetailSumDto.setCityId(area.getCityId());

				poiDetailSumDto.setImage(area.getImage());
				poiDetailSumDto.setCoverImage(imageUrl + area.getCoverImage());
				
				List<String> openTimeDesc = new ArrayList<String>();
				openTimeDesc.add(area.getOpenTime());
				poiDetailSumDto.setOpenTime(openTimeDesc);
				
				poiDetailSumDto.setPriceDesc("");
				poiDetailSumDto.setRating(5.0);

				/*List<POIDetailSpecialDto> poiDetailSpecialDtos = new ArrayList<POIDetailSpecialDto>();
				List<ShoppingBrand> shoppingBrands = shopping.getShoppingBrands();
				if (shoppingBrands != null && shoppingBrands.size() > 0) {
					for (ShoppingBrand shoppingBrand : shoppingBrands) {
						POIDetailSpecialDto poiDetailSpecialDto = new POIDetailSpecialDto();
						poiDetailSpecialDto.setId(shoppingBrand.getId());
						poiDetailSpecialDto.setAdvice(shoppingBrand.getAdvice());
						poiDetailSpecialDto.setDesc(shoppingBrand.getDesc());
						poiDetailSpecialDto.setTitle(shoppingBrand.getTitle());
						poiDetailSpecialDto.setTag(shoppingBrand.getTag());
						poiDetailSpecialDto.setCoverImage(imageUrl + shoppingBrand.getCoverImage());
						poiDetailSpecialDtos.add(poiDetailSpecialDto);
					}
				}*/
				poiDetailSumDto.setSpecial(null);

				List<POIDetailActivitiesDto> poiDetailActivitiesDtos = new ArrayList<POIDetailActivitiesDto>();
				poiDetailSumDto.setActivities(poiDetailActivitiesDtos);

				List<POIDetailTagDto> poiDetailTagDtos = new ArrayList<POIDetailTagDto>();
				List<String> basePOITags = area.getTags();
				if (basePOITags != null && basePOITags.size() > 0) {
					for (String basePOITag : basePOITags) {
						POIDetailTagDto poiDetailTagDto = new POIDetailTagDto();
						poiDetailTagDto.setId("");
						poiDetailTagDto.setName(basePOITag);
						poiDetailTagDtos.add(poiDetailTagDto);
					}
				}
				poiDetailSumDto.setTag(poiDetailTagDtos);

				poiDetailSumDto.setTips(area.getTips());
				poiDetailSumDto.setCommentsUrl("");
				poiDetailSumDto.setCommentFrom("");

				List<POIDetailCommentsDto> poiDetailCommentsDtos = new ArrayList<POIDetailCommentsDto>();
				List<BasePOIComments> basePOIComments = area.getComments();
				if (basePOIComments != null && basePOIComments.size() > 0) {
					for (BasePOIComments basePOIComment : basePOIComments) {
						POIDetailCommentsDto poiDetailCommentsDto = new POIDetailCommentsDto();
						poiDetailCommentsDto.setNickname(basePOIComment.getNickname());
						if(basePOIComment.getDate() != null) {
							poiDetailCommentsDto.setDate(basePOIComment.getDate());
						}
						poiDetailCommentsDto.setText(basePOIComment.getText());
						poiDetailCommentsDto.setRating(basePOIComment.getRating());
						poiDetailCommentsDto.setTitle(basePOIComment.getTitle());
						poiDetailCommentsDto.setLanguage(basePOIComment
								.getLanguage());
						poiDetailCommentsDtos.add(poiDetailCommentsDto);
					}
				}
				poiDetailSumDto.setComments(poiDetailCommentsDtos);
				poiDetailSumDto.setOpenTableUrl("");
				poiDetailSumDto.setOpenDay(0);

				poiDetailSumDto.setFacilities(null);
			}
		} catch (Exception e) {
			logger.info("探索城市商圈详情页出错!");
			e.printStackTrace();
		}
		return poiDetailSumDto;
	}

}
