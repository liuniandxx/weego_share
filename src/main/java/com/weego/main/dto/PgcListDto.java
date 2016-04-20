package com.weego.main.dto;


import java.util.List;

public class PgcListDto {

    private Integer type;

    private String tag;

    private List<PgcListContentDto> content;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<PgcListContentDto> getContent() {
        return content;
    }

    public void setContent(List<PgcListContentDto> content) {
        this.content = content;
    }
}
