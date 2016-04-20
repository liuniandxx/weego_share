package com.weego.main.dto;

import java.util.List;

/**
 * Created by liuniandxx on 16-3-21.
 */
public class PgcDetailDto {

    private Integer type;

    private String coverImage;

    private String title;

    private OriginalDto original;

    private PgcPersonDto person;

    private String introduction;

    private List<PgcContentDto> content;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OriginalDto getOriginal() {
        return original;
    }

    public void setOriginal(OriginalDto original) {
        this.original = original;
    }

    public PgcPersonDto getPerson() {
        return person;
    }

    public void setPerson(PgcPersonDto person) {
        this.person = person;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<PgcContentDto> getContent() {
        return content;
    }

    public void setContent(List<PgcContentDto> content) {
        this.content = content;
    }
}
