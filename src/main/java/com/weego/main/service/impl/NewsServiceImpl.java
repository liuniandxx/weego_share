package com.weego.main.service.impl;


import com.google.common.base.Strings;
import com.weego.main.dao.NewsDao;
import com.weego.main.dto.NewsContentDto;
import com.weego.main.dto.NewsDto;
import com.weego.main.model.News;
import com.weego.main.model.NewsContent;
import com.weego.main.service.NewsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service("newsService")
public class NewsServiceImpl implements NewsService {
    private Logger logger = LogManager.getLogger(NewsServiceImpl.class);

    private String leadImageUrl = "http://weegotest.b0.upaiyun.com/brands/origin/";
    private String contentImageUrl = "http://weegotest.b0.upaiyun.com/restaurant/origin/";

    @Autowired
    NewsDao newsDao;

    @Override
    public NewsDto getNewsById(String newsId) {
        News news = newsDao.getNewsById(newsId);

        if (news == null) {
            return null;
        } else {
            NewsDto newsDto = new NewsDto();
            newsDto.setLead(Strings.nullToEmpty(news.getLead()));
            newsDto.setLeadText(Strings.nullToEmpty(news.getLeadText()));
            newsDto.setImage(Strings.nullToEmpty(news.getImage()));

            List<NewsContentDto> newsContentDtoList = new ArrayList<>();
            newsDto.setContents(newsContentDtoList);

            if (news.getNewsContentList() != null) {
                for (NewsContent content : news.getNewsContentList()) {
                    NewsContentDto newsContentDto = new NewsContentDto();

                    newsContentDto.setTitle(content.getTitle() == null ? "" : content.getTitle());
                    newsContentDto.setDate(content.getDate() == null ? "" : content.getDate());
                    newsContentDto.setSource(content.getSource() == null ? "" : content.getSource());
                    newsContentDto.setImage(content.getImage() == null ? "" : content.getImage());
                    newsContentDto.setImageDesc(content.getImageDesc() == null ? "" : content.getImageDesc());
                    newsContentDto.setText(content.getText() == null ? "" : content.getText());
                    newsContentDto.setUrl(content.getUrl() == null ? "" : content.getUrl());

                    newsContentDtoList.add(newsContentDto);
                }
            }

            return newsDto;
        }
    }

    @Override
    public ModelAndView getSpecificNews(String newsId) {
        ModelAndView mv = new ModelAndView("news");
        News news = newsDao.getNewsById(newsId);
        if (news == null) {
            mv = null;
        } else{
            mv.addObject("lead", news.getLead());
            mv.addObject("leadText", news.getLeadText());
            String image = news.getImage();
            if(Strings.isNullOrEmpty(image)) {
                news.setImage(Strings.nullToEmpty(image));
            } else {
                news.setImage(leadImageUrl + image);
            }
            mv.addObject("image", news.getImage());
            List<NewsContent> newsContentList = news.getNewsContentList();
            if(newsContentList != null && newsContentList.size() > 0) {
                for(NewsContent content : newsContentList) {
                    String contentImage = content.getImage();
                    if(Strings.isNullOrEmpty(contentImage)) {
                        content.setImage(Strings.nullToEmpty(contentImage));
                    } else {
                        content.setImage(contentImageUrl + contentImage);
                    }
                }
            }
            mv.addObject("newsContentList", news.getNewsContentList());
        }
        return mv;
    }
}
