package com.weego.main.service;

import com.weego.main.dto.POIDetailSumDto;

public interface AttractionService {

	POIDetailSumDto getAttractionById(String id, String coordination);

}
