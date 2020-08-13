package com.bubblecart.product.microservice.domain;

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
	private Integer product_id;
	
	@Column(name = "subcategory_id")
	private Integer subcategory_id;
	
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

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
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

	public Integer getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(Integer subcategory_id) {
		this.subcategory_id = subcategory_id;
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

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", subcategory_id=" + subcategory_id + ", product_name="
				+ product_name + ", product_description=" + product_description + ", units_in_stock=" + units_in_stock
				+ ", image_name=" + image_name + ", unit_price=" + unit_price + "]";
	}
	

}
