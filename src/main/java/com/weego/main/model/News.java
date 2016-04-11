package com.weego.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mongojack.Id;

import java.util.List;

public class News {

    @Id
    private String id;

    @JsonProperty("lead")
    private String lead;

    @JsonProperty("lead_text")
    private String leadText;

    @JsonProperty("image")
    private String image;

    @JsonProperty("news_content")
    private List<NewsContent> newsContentList;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getLeadText() {
        return leadText;
    }

    public void setLeadText(String leadText) {
        this.leadText = leadText;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<NewsContent> getNewsContentList() {
        return newsContentList;
    }

    public void setNewsContentList(List<NewsContent> newsContentList) {
        this.newsContentList = newsContentList;
    }
}
