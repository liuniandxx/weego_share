package com.weego.main.service;

import org.springframework.web.servlet.ModelAndView;

public interface BasePOIService {

	ModelAndView getPOIDetail(String id, Integer type);
}
