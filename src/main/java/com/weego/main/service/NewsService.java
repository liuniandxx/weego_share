package com.weego.main.service;


import org.springframework.web.servlet.ModelAndView;

import com.weego.main.dto.NewsDto;

public interface NewsService {

    NewsDto getNewsById(String newsId);
    
    ModelAndView getSpecificNews(String newsId);

}
