package com.usecase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.usecase.model.GroupProduct;
import com.usecase.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	
	@Query(nativeQuery = true, value =
	           "SELECT " +
	           "    p.productId AS productId, p.productname as productname " +
	           "FROM " +
	           "    Product p  " +
	           "GROUP BY " +
	           "    p.categoryid")
	    List<GroupProduct> findGroupByCatalog();
	
	@Query(nativeQuery = true, value =
	           "SELECT " +
	           "    p.productId AS productId, p.productname as productname " +
	           "FROM " +
	           "    Product p  " +
	           "GROUP BY " +
	           "    p.price")
	    List<GroupProduct> findGroupByPrice();
}
