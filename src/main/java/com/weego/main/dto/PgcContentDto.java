package com.weego.main.dto;

/**
 * Created by liuniandxx on 16-3-28.
 */
public class PgcContentDto {
    private ParagraphDto paragraph;

    private PgcPoiDto poi;

    private PgcImageDto image;

    public ParagraphDto getParagraph() {
        return paragraph;
    }

    public void setParagraph(ParagraphDto paragraph) {
        this.paragraph = paragraph;
    }

    public PgcPoiDto getPoi() {
        return poi;
    }

    public void setPoi(PgcPoiDto poi) {
        this.poi = poi;
    }

    public PgcImageDto getImage() {
        return image;
    }

    public void setImage(PgcImageDto image) {
        this.image = image;
    }
}
