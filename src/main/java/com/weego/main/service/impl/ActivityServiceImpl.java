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
import com.weego.main.dao.ActivityDao;
import com.weego.main.model.Activities;
import com.weego.main.model.ActivitiesImagesDesc;
import com.weego.main.service.ActivityService;
import com.weego.main.util.HttpUtil;

@Service("cityActivityService")
public class ActivityServiceImpl implements ActivityService {

	private Logger logger = LogManager.getLogger(ActivityServiceImpl.class);
	
	private String ACTIVITY_REQUEST_URL = "http://123.56.65.17/api/v2/activityDetail";
	private String coverImageUrl = "http://weegotest.b0.upaiyun.com/activities/iosimgs/";
	
	@Autowired
	private ActivityDao cityActivityDao;

	/*@Override
	public ModelAndView getSpecifiedActivity(String activityId) {

		ModelAndView mv = new ModelAndView("activity");
		try {
			Activities activity = cityActivityDao.getSpecifiedCity(activityId);
			if (activity != null) {
				mv.addObject("title", activity.getTitle());
				mv.addObject("time", activity.getActTime());
				mv.addObject("tag", "");
				mv.addObject("ip", activity.getDetailAddress());
				mv.addObject("bg", imageUrl + activity.getCoverImage());
				mv.addObject("web", activity.getActUrl());
				mv.addObject("ticket", activity.getOrderUrl());
				mv.addObject("details", activity.getDesc());
				mv.addObject("paragraphs", activity.getImageDesc());
			}
		} catch (Exception e) {
			logger.info("活动接口出错!");
			e.printStackTrace();
		}

		return mv;
	}*/
	
	@Override
	public ModelAndView getSpecifiedActivity(String activityId) {

		ModelAndView mv = new ModelAndView("activity");
		try {
			JSONObject result = JSONObject.parseObject(HttpUtil.sendGet(ACTIVITY_REQUEST_URL, "aid=" + activityId, "other"));
			if (result != null) {
				JSONObject json = result.getJSONObject("result");
				mv.addObject("title", json.get("title"));
				mv.addObject("time", json.get("acttime"));
				mv.addObject("tag", json.get("atype"));
				mv.addObject("ip", json.get("deaddress"));
				mv.addObject("bg", coverImageUrl + json.get("cover_image") );
				mv.addObject("web", json.get("acturl"));
				mv.addObject("ticket", json.get("order_url"));
				mv.addObject("details", json.get("desc"));
				mv.addObject("paragraphs", getImagesDesc((List<Map<String, Object>>) json.get("images_desc")));
			}
		} catch (Exception e) {
			logger.info("活动接口出错!");
			e.printStackTrace();
		}

		return mv;
	}
	
	private List<ActivitiesImagesDesc> getImagesDesc(List<Map<String, Object>> obj) {
		List<ActivitiesImagesDesc> acList = new ArrayList<ActivitiesImagesDesc>();
		if(obj != null && obj.size() > 0) {
			for(int i=0;i<obj.size();i++) {
				ActivitiesImagesDesc acImagesDesc = new ActivitiesImagesDesc();
				acImagesDesc.setImageUrl((String) obj.get(i).get("image_id"));
				acImagesDesc.setImageBrief((String) obj.get(i).get("image_desc"));
				acImagesDesc.setDetail((String) obj.get(i).get("desc"));
				acImagesDesc.setImageTitle((String) obj.get(i).get("title"));
				acList.add(acImagesDesc);
			}
		} else {
			acList = null;
		}
		return acList;
	}
}
