package com.usecase.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private long productId;
	@Column(name = "price")
	private BigDecimal price;
	@Column(name = "color")
	private String color;
	@Column(name = "sku")
	private String sku;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brandid", nullable = false)
	private Brand brandId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryid", nullable = false)
	private Category categoryId;
	
	@Column(name = "productname")
	private String productname;
	
		
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Brand getBrandId() {
		return brandId;
	}
	public void setBrandId(Brand brandId) {
		this.brandId = brandId;
	}
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	

}
