package com.weego.main.controller;

import com.weego.main.dto.NewsDto;
import com.weego.main.dto.ResponseDto;
import com.weego.main.service.NewsService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/news/v1")
public class NewsController {

    private static Logger logger = LogManager.getLogger(NewsController.class);

    @Autowired
    NewsService newsService;

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto<NewsDto> getNewsById(@RequestParam("newsId") String newsId) {
        logger.info("newsId=[{}]", newsId);

        ResponseDto<NewsDto> responseDto = new ResponseDto<>();
        NewsDto newsDto = newsService.getNewsById(newsId);

        if (newsDto == null) {
            newsDto = new NewsDto();
            responseDto.setData(newsDto);

            logger.fatal("新闻数据为空 newsId=[{}]", newsId);
        } else {
            responseDto.setData(newsDto);
        }

        return responseDto;
    }
    
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getPgc(@RequestParam("newsId") String newsId) {

        return newsService.getSpecificNews(newsId);
    }
}
