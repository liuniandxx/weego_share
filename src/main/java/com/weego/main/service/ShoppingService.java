package com.weego.main.service;

import com.weego.main.dto.POIDetailSumDto;

public interface ShoppingService {
	
	POIDetailSumDto getShoppingById(String id, String coordination);

}
