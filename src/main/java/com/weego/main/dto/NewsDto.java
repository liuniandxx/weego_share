package com.weego.main.dto;

import java.util.List;

public class NewsDto {

    private String lead;

    private String leadText;

    private String image;

    private List<NewsContentDto> contents;

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

    public List<NewsContentDto> getContents() {
        return contents;
    }

    public void setContents(List<NewsContentDto> contents) {
        this.contents = contents;
    }
}
