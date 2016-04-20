package com.weego.main.dto;

import java.util.List;

/**
 * Created by liuniandxx on 16-3-21.
 */
public class PersonDto {
    private String headImage;

    private String userName;

    private String  jobDesc;

    List<PersonSimpleIntroduceDto> simpleIntroduce;

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public List<PersonSimpleIntroduceDto> getSimpleIntroduce() {
        return simpleIntroduce;
    }

    public void setSimpleIntroduce(List<PersonSimpleIntroduceDto> simpleIntroduce) {
        this.simpleIntroduce = simpleIntroduce;
    }
}
