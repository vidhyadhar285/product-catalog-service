package com.usecase.service;

import java.util.List;

import com.usecase.model.GroupProduct;

public interface ProductCatalogService {
	
	public List<GroupProduct> fetchGroupedBrands();
	public List<GroupProduct> fetchGroupedPrice();
	

}
