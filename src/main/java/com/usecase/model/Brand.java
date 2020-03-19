package com.usecase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brandid")
	private Long brandid;
	
	@Column(name = "brandname")
	private String brandname;

	public Long getBrandid() {
		return brandid;
	}

	public void setBrandid(Long brandid) {
		this.brandid = brandid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	
	
}
