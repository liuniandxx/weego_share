package com.weego.main.service;

import com.weego.main.dto.POIDetailSumDto;

public interface AreaService {
	
	POIDetailSumDto getAreaById(String id, String coordination);

}
