package com.bubblecart.product.microservice.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "subcategory_id")
	private Integer subcategoryId;
	
	@Column(name = "product_name")
	private String product_name;
	
	@Column(name = "product_description")
	private String product_description;
	
	@Column(name = "units_in_stock")
	private Integer units_in_stock;
	
	@Column(name = "image_name")
	private String image_name;
	
	@Column(name = "unit_price")
	private Integer unit_price;
	
	@Column(name = "product_sku")
	private String product_sku;
	
	@Column(name = "expiry_date")
	private Date expiry_date;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public Integer getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(Integer subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public Integer getUnits_in_stock() {
		return units_in_stock;
	}

	public void setUnits_in_stock(Integer units_in_stock) {
		this.units_in_stock = units_in_stock;
	}

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}

	public Integer getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Integer unit_price) {
		this.unit_price = unit_price;
	}

	public String getProduct_sku() {
		return product_sku;
	}

	public void setProduct_sku(String product_sku) {
		this.product_sku = product_sku;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", subcategoryId=" + subcategoryId + ", product_name=" + product_name
				+ ", product_description=" + product_description + ", units_in_stock=" + units_in_stock
				+ ", image_name=" + image_name + ", unit_price=" + unit_price + ", product_sku=" + product_sku
				+ ", expiry_date=" + expiry_date + "]";
	}
	

}
