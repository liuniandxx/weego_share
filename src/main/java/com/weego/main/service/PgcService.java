package com.weego.main.service;

import org.springframework.web.servlet.ModelAndView;

public interface PgcService {

	ModelAndView getSpecifiedPgc(String pgcId);
}
