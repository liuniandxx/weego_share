package com.weego.main.service;

import org.springframework.web.servlet.ModelAndView;

public interface ActivityService {
    
     ModelAndView getSpecifiedActivity(String activityId);

}
