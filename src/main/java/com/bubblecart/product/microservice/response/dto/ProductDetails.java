package com.bubblecart.product.microservice.response.dto;

import java.sql.Date;
import java.util.Arrays;

public class ProductDetails {
	
	private Integer product_id;
	private Integer subcategory_id;
	private String product_name;
	private String product_description;
	private Integer units_in_stock;
	private Integer unit_price;
	private String product_sku;
	private Date expiry_date;
    private byte[] image;
    
	public Integer getProduct_id() {
		return product_id;
	}
	
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	
	public Integer getSubcategory_id() {
		return subcategory_id;
	}
	
	public void setSubcategory_id(Integer subcategory_id) {
		this.subcategory_id = subcategory_id;
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
	
	public Integer getUnits_in_stock() {
		return units_in_stock;
	}
	
	public void setUnits_in_stock(Integer units_in_stock) {
		this.units_in_stock = units_in_stock;
	}
	
	public Integer getUnit_price() {
		return unit_price;
	}
	
	public void setUnit_price(Integer unit_price) {
		this.unit_price = unit_price;
	}
	
	public byte[] getImage() {
		return image;
	}
	
	public void setImage(byte[] image) {
		this.image = image;
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
		return "ProductDetails [product_id=" + product_id + ", subcategory_id=" + subcategory_id + ", product_name="
				+ product_name + ", product_description=" + product_description + ", units_in_stock=" + units_in_stock
				+ ", unit_price=" + unit_price + ", product_sku=" + product_sku + ", expiry_date=" + expiry_date
				+ ", image=" + Arrays.toString(image) + "]";
	}
	
		
}
