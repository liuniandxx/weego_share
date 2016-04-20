package com.weego.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.weego.main.service.ActivityService;
import com.weego.main.service.BasePOIService;
import com.weego.main.service.NewsService;
import com.weego.main.service.PgcService;

@Controller
@RequestMapping("/share/v1")
public class ShareController {
	
	@Autowired
	PgcService pgcService;
	
	@Autowired
	ActivityService activityService;
    
    @Autowired
    BasePOIService basePOIService;
    
    @Autowired
    NewsService newsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getShare() {

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name", "Weego");

        return mv;
    }
    
    @RequestMapping(value = "/pgc", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getPgc(@RequestParam("pgcId") String pgcId) {

        return pgcService.getSpecifiedPgc(pgcId);
    }
    
    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getActivity(@RequestParam("activityId") String activityId) {

        return activityService.getSpecifiedActivity(activityId);
    }
    
    @RequestMapping(value = "/poi", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getPOI(@RequestParam("poiId") String poiId,
    		@RequestParam("type") Integer type) {

        return basePOIService.getPOIDetail(poiId, type);
    }


    @RequestMapping(value = "/news", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getPOI(@RequestParam("newsId") String newsId ) {

        return newsService.getSpecificNews(newsId);
    }

}
