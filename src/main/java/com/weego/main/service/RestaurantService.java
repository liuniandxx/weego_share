package com.weego.main.service;

import com.weego.main.dto.POIDetailSumDto;

public interface RestaurantService {
	
	POIDetailSumDto getRestaurantById(String id, String coordination);
	
}
