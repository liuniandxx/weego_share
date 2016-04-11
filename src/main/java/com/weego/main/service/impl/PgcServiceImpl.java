package com.weego.main.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.weego.main.dao.AreaDao;
import com.weego.main.dao.AttractionDao;
import com.weego.main.dao.PeopleDao;
import com.weego.main.dao.PgcDao;
import com.weego.main.dao.RestaurantDao;
import com.weego.main.dao.ShoppingDao;
import com.weego.main.dto.ParagraphDto;
import com.weego.main.dto.PgcContentDto;
import com.weego.main.dto.PgcImageDto;
import com.weego.main.dto.PgcPoiDto;
import com.weego.main.model.Peoples;
import com.weego.main.model.PgcOriginal;
import com.weego.main.service.PgcService;
import com.weego.main.util.HttpUtil;

@Service("pgcService")
public class PgcServiceImpl implements PgcService {
	
	private Logger logger = LogManager.getLogger(PgcServiceImpl.class);
	
	private String PGC_REQUEST_URL = "http://123.56.65.17/api/v2/pgcDetail";
	private String coverImageUrl = "http://weegotest.b0.upaiyun.com/brands/iosimgs/";
	private String firstImageUrl = "http://weegotest.b0.upaiyun.com/attractions/origin/";
	private String secondImageUrl = "http://weegotest.b0.upaiyun.com/restaurant/origin/";
	private String thirdImageUrl = "http://weegotest.b0.upaiyun.com/shopping/origin/";
	private String fourthImageUrl = "http://weegotest.b0.upaiyun.com/shoparea/origin/";
	private String authorHeadImageUrl = "http://weegotest.b0.upaiyun.com/brands/origin/";
	
	@Autowired
	private PgcDao pgcDao;

	@Autowired
	private PeopleDao peopleDao;

	@Autowired
	private AttractionDao attractionDao;

	@Autowired
	private RestaurantDao restaurantDao;

	@Autowired
	private ShoppingDao shoppingDao;

	@Autowired
	private AreaDao areaDao;

	/*@Override
    public ModelAndView getSpecifiedPgc(String pgcId) {

        Pgcs pgc = pgcDao.getSpecifiedPgc(pgcId);
        if (pgc == null) {
            return null;
        } else {
            ModelAndView mv = new ModelAndView("PGC");
            mv.addObject("cover_img", coverImageUrl + pgc.getCoverImage());
            mv.addObject("title", pgc.getTitle());
            
            if (Strings.isNullOrEmpty(pgc.getPgcPeople().getId())) {
                mv.addObject("person", null);
            } else {
                Peoples person = peopleDao.getPeopleById(pgc.getPgcPeople().getId().trim());
                if(person!=null){
                    mv.addObject("person", person);
                }else{
                    mv.addObject("person", null);
                }
            }
            
            mv.addObject("original", null);

            List<PgcPoi> pgcPoiList = pgc.getPgcPoi();
            List<PgcContentDto> pgcPoiDtoList = new ArrayList<PgcContentDto>();
            if (pgcPoiList != null && pgcPoiList.size() > 0) {
                for (PgcPoi pgcPoi : pgcPoiList) {
                    PgcContentDto pgcContentDto = new PgcContentDto();
                    ParagraphDto paragraphDto = new ParagraphDto();
                    paragraphDto.setTitle(Strings.nullToEmpty(""));
                    paragraphDto.setDesc(Strings.nullToEmpty(pgcPoi.getPoiDesc()));
                    pgcContentDto.setParagraph(paragraphDto);

                    PgcPoiDto pgcPoiDto = new PgcPoiDto();
                    pgcPoiDto.setId(Strings.nullToEmpty(pgcPoi.getId()));
                   
                    if(pgcPoi.getType().equals("0")) {
                    	pgcPoiDto.setImage(firstImageUrl + Strings.nullToEmpty(pgcPoi.getPoiImage()));
                    } else if(pgcPoi.getType().equals("1")) {
                    	pgcPoiDto.setImage(secondImageUrl + Strings.nullToEmpty(pgcPoi.getPoiImage()));
                    } else if(pgcPoi.getType().equals("2")) {
                    	pgcPoiDto.setImage(thirdImageUrl + Strings.nullToEmpty(pgcPoi.getPoiImage()));
                    } else {
                    	pgcPoiDto.setImage(null);
                    }
                    
                    pgcPoiDto.setType(Strings.nullToEmpty(pgcPoi.getType()));
                    pgcPoiDto.setTitle(Strings.nullToEmpty(pgcPoi.getName()));
                    pgcPoiDto.setTag(getPoiTagbyType(pgcPoi.getId(), pgcPoi.getType()));
                    pgcContentDto.setPoi(pgcPoiDto);

                    pgcContentDto.setImage(null);
                    pgcPoiDtoList.add(pgcContentDto);
                }
            } else {
            	pgcPoiDtoList = null;
            }
            if(pgcPoiList != null) {
            	mv.addObject("poilist", pgcPoiDtoList);
            } else {
            	mv.addObject("poilist", null);
            }
            
            mv.addObject("breif", pgc.getIntroducation());
            return mv;
        }
    }
	
	private String getPoiTagbyType(String id, String type) {
		if (Strings.isNullOrEmpty(type)) {
			return "";
		}

		Integer intType = Integer.parseInt(type);
		if (intType == 0) {
			LatestAttractions attraction = attractionDao.getAttractionById(id);
			List<BasePOILabel> basePOITags = attraction.getSubLabelNew();
			if (basePOITags != null && basePOITags.size() > 0) {
				return basePOITags.get(0).getLabel();
			} else {
				return "";
			}
		} else if (intType == 1) {
			Restaurants restaurant = restaurantDao.getRestaurantById(id);

			List<String> basePOITags = restaurant.getTagsZh();
			if (basePOITags != null && basePOITags.size() > 0) {
				return basePOITags.get(0);
			} else {
				return "";
			}
		} else if (intType == 2) {
			Shoppings shopping = shoppingDao.getShoppingById(id);
			List<ShopTag> basePOITags =	shopping.getShoptags();
			if (basePOITags != null && basePOITags.size() > 0) {
				return basePOITags.get(0).getTitle();
			} else {
				return "";
			}
		} 

		return "";
	}*/
	
	@Override
    public ModelAndView getSpecifiedPgc(String pgcId) {
		ModelAndView mv = new ModelAndView("PGC");
		try {
			JSONObject result = JSONObject.parseObject(HttpUtil.sendGet(PGC_REQUEST_URL, "pgcId=" + pgcId, "other"));
			if (result != null) {
				JSONObject json = result.getJSONObject("result");
				mv.addObject("cover_img", coverImageUrl + (String) json.get("cover_image"));
		        mv.addObject("title", (String) json.get("title"));
		        
		        mv.addObject("person", getPerson((Map<String, Object>) json.get("people")));
		        mv.addObject("original",getOriginal((Map<String, Object>) json.get("original")));
		        mv.addObject("breif", (String) json.get("introducation"));
		        
		        mv.addObject("poilist",getPOIList((List<Map<String, Object>>) json.get("pgc_poi")));
			}
		} catch(Exception e) {
			logger.info("pgc接口出错!");
			e.printStackTrace();
		}
		return mv;
	}
	
	private Peoples getPerson(Map<String, Object> obj) {
		Peoples peoples = new Peoples();
		if(obj != null && obj.size() > 0) {
			peoples.setHeadImage(authorHeadImageUrl + (String) obj.get("head_image"));
			peoples.setUsername((String) obj.get("username"));
			peoples.setJobDesc((String) obj.get("job_desc"));
		} else {
			peoples = null;
		}
		return peoples;
	}
	
	private PgcOriginal getOriginal(Map<String, Object> obj) {
		PgcOriginal pgcOriginal = new PgcOriginal();
		if(obj != null && obj.size() > 0) {
			pgcOriginal.setAuthor((String) obj.get("author"));
			pgcOriginal.setDesc((String) obj.get("desc"));
			pgcOriginal.setImage(authorHeadImageUrl + (String) obj.get("image"));
			pgcOriginal.setSource((String) obj.get("source"));
			pgcOriginal.setUrl((String) obj.get("url"));
			
		} else {
			pgcOriginal = null;
		}
		return pgcOriginal;
	}
	
	private  List<PgcContentDto> getPOIList(List<Map<String, Object>> obj) {
		 List<PgcContentDto> pgcPoiDtoList = new ArrayList<PgcContentDto>();
		 if(obj != null && obj.size() > 0) {
			 for(int i=0;i<obj.size();i++) {
				 
				 Map<String, Object> detail = (Map<String, Object>) obj.get(i).get("detail");
				 PgcContentDto pgcContentDto = new PgcContentDto();
				 
				 PgcImageDto pgcImageDto = new PgcImageDto();
				 if((String) obj.get(i).get("section_image") == null) {
					 pgcImageDto.setUrl(null);
				 } else {
					 pgcImageDto.setUrl(secondImageUrl + (String) obj.get(i).get("section_image"));
				 }
				 
				 pgcImageDto.setSource((String) obj.get(i).get("image_title"));
				 pgcContentDto.setImage(pgcImageDto);
				 
				 ParagraphDto paragraphDto = new ParagraphDto();
				 paragraphDto.setDesc((String) obj.get(i).get("poi_desc"));
				 paragraphDto.setTitle((String) obj.get(i).get("poi_image_desc"));
				 pgcContentDto.setParagraph(paragraphDto);
				 
				 PgcPoiDto pgcPoiDto = new PgcPoiDto();
				 pgcPoiDto.setType((String) obj.get(i).get("type"));
				 pgcPoiDto.setTitle((String) obj.get(i).get("name"));
				 if("0".equals(obj.get(i).get("type"))) { 
					 if((String) obj.get(i).get("poi_image") == null) {
						 pgcPoiDto.setImage(null);
					 } else {
						 pgcPoiDto.setImage(firstImageUrl + (String) obj.get(i).get("poi_image"));
					 } 
					 
					 try {
						 if(detail != null && detail.size() > 0) {
							 if(detail.containsKey("subLabelNew")) {
								 List<Map<String, Object>> tags = (List<Map<String, Object>> ) detail.get("subLabelNew");
								 if(tags != null && tags.size() > 0) {
									 if(tags.get(0).containsKey("label")) {
										 pgcPoiDto.setTag((String) tags.get(0).get("label"));
									 } else {
										 pgcPoiDto.setTag("");
									 }
								 }
							 }
						 }else {
							 pgcPoiDto.setTag("");
						 }
					} catch (Exception e) {
						logger.info("标签值有误!");
						pgcPoiDto.setTag("");
						e.printStackTrace();
					}
					 
					 
				 }else if("1".equals(obj.get(i).get("type"))) {
					 if((String) obj.get(i).get("poi_image") == null) {
						 pgcPoiDto.setImage(null);
					 } else {
						 pgcPoiDto.setImage(secondImageUrl + (String) obj.get(i).get("poi_image"));
					 } 
					 
					 try {
						 if(detail != null && detail.size() > 0) {
							 if(detail.containsKey("tags_zh")) {
								 List<String> tags = (List<String>) obj.get(i).get("tags_zh");
								 if(tags != null && tags.size() > 0) {
									 pgcPoiDto.setTag((String) tags.get(0));
								 }
							 }
						 }else {
							 pgcPoiDto.setTag("");
						 }
						 
					} catch (Exception e) {
						logger.info("标签值有误!");
						pgcPoiDto.setTag("");
						e.printStackTrace();
					}
					 
				 } else if("2".equals(obj.get(i).get("type"))) {
					 if((String) obj.get(i).get("poi_image") == null) {
						 pgcPoiDto.setImage(null);
					 } else {
						 pgcPoiDto.setImage(thirdImageUrl + (String) obj.get(i).get("poi_image"));
					 } 
					 
					 try {
						 if(detail != null && detail.size() > 0) {
							 if(detail.containsKey("subLabelNew")) {
								 List<Map<String, Object>> tags = (List<Map<String, Object>> ) obj.get(i).get("subLabelNew");
								 if(tags != null && tags.size() > 0) {
									 if(tags.get(0).containsKey("label")) {
										 pgcPoiDto.setTag((String) tags.get(0).get("label"));
									 } else {
										 pgcPoiDto.setTag("");
									 }
								 } 
							 }
						 } else {
								 pgcPoiDto.setTag("");
							 }
							 
						} catch (Exception e) {
							logger.info("标签值有误!");
							pgcPoiDto.setTag("");
							e.printStackTrace();
						}
					 
				 } else if("3".equals(obj.get(i).get("type"))) {
					 if((String) obj.get(i).get("poi_image") == null) {
						 pgcPoiDto.setImage(null);
					 } else {
						 pgcPoiDto.setImage((fourthImageUrl + (String) obj.get(i).get("poi_image")).replace(" ", "%20"));
					 } 
					 
					 try {
						 if(detail != null && detail.size() > 0) {
							 if(detail.containsKey("tags")) {
								 List<String> tags = (List<String>) obj.get(i).get("tags");
								 if(tags != null && tags.size() > 0) {
									 pgcPoiDto.setTag((String) tags.get(0));
								 }
							 }
						 }else {
							 pgcPoiDto.setTag("");
						 }
						 
					} catch (Exception e) {
						logger.info("标签值有误!");
						pgcPoiDto.setTag("");
						e.printStackTrace();
					}
				 }
				 
				 
				 pgcContentDto.setPoi(pgcPoiDto);
				 pgcPoiDtoList.add(pgcContentDto);
			 }
		 } else {
			 pgcPoiDtoList = null;
		 }
		 return pgcPoiDtoList;
	}
}