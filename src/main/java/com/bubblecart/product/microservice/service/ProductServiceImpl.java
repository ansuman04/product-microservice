package com.bubblecart.product.microservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.bubblecart.product.microservice.domain.Product;
import com.bubblecart.product.microservice.repo.ProductRepository;
import com.bubblecart.product.microservice.response.dto.ProductDetails;
import com.bubblecart.product.microservice.util.ImageUtil;

@Component
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	ImageUtil AWSS3util;
	
	@Override
	public List<ProductDetails> getAllProducts(int subCategoryId,Pageable pageable) {
		
		List<Product> productList  = productRepo.findBysubcategoryId(subCategoryId,pageable);
		
		List <ProductDetails> productDetailsList = new ArrayList<ProductDetails>();
		
		for(Product product:productList) {
			ProductDetails productDetails = new ProductDetails();
			
			productDetails.setProduct_id(product.getProductId());
			productDetails.setProduct_name(product.getProduct_name());
			productDetails.setProduct_description(product.getProduct_description());
			productDetails.setSubcategory_id(product.getSubcategoryId());
			productDetails.setImage(AWSS3util.getImageData(product.getImage_name()));
			productDetails.setUnits_in_stock(product.getUnits_in_stock());
			productDetails.setUnit_price(product.getUnit_price());
			productDetails.setProduct_sku(product.getProduct_sku());
			productDetails.setExpiry_date(product.getExpiry_date());
			
			productDetailsList.add(productDetails);
		}
		
		
		return productDetailsList;
	}

	@Override
	public ProductDetails getProductDetails(int productId) {

        Product product = productRepo.findByproductId(productId);
        
        ProductDetails productDetails = new ProductDetails();
        
        if(product!=null) {
        productDetails.setProduct_id(product.getProductId());
		productDetails.setProduct_name(product.getProduct_name());
		productDetails.setProduct_description(product.getProduct_description());
		productDetails.setSubcategory_id(product.getSubcategoryId());
		productDetails.setImage(AWSS3util.getImageData(product.getImage_name()));
		productDetails.setUnits_in_stock(product.getUnits_in_stock());
		productDetails.setUnit_price(product.getUnit_price());
        }
        
        return productDetails;    
        
	}

}
