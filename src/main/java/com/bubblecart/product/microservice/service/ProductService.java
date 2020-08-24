package com.bubblecart.product.microservice.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bubblecart.product.microservice.response.dto.ProductDetails;

@Component
@Transactional
public interface ProductService {
	
	List<ProductDetails> getAllProducts(int subCategoryId,Pageable pageable);
	
	ProductDetails getProductDetails(int productId);

}
