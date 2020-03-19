package com.usecase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.model.GroupProduct;

@RestController
@RequestMapping("/")
public class ProductSearchController {
	
	@Autowired
	private ProductCatalogService productCatalogService;

	@GetMapping(value = "/grouped-brand/products")
	public ResponseEntity<List<GroupProduct>> fetchGroupedBrands(){
		List<GroupProduct> groupByBrands=productCatalogService.fetchGroupedBrands();
		return ResponseEntity.ok(groupByBrands);
	}
	
	@GetMapping(value = "/grouped-price/products")
	public ResponseEntity<List<GroupProduct>> fetchGroupedPrice(){
		List<GroupProduct> groupByPrice=productCatalogService.fetchGroupedPrice();
		return ResponseEntity.ok(groupByPrice);
	}
	
}
