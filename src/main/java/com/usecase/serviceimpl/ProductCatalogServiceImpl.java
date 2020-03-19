package com.usecase.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.model.GroupProduct;
import com.usecase.repository.ProductRepository;
import com.usecase.service.ProductCatalogService;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<GroupProduct> fetchGroupedBrands() {
		List<GroupProduct> brands=productRepository.findGroupByCatalog();
		return brands;
	}

	@Override
	public List<GroupProduct> fetchGroupedPrice() {
		List<GroupProduct> groupProducts=productRepository.findGroupByPrice();
		return groupProducts;
	}

}
