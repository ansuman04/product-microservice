package com.bubblecart.product.microservice.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bubblecart.product.microservice.domain.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
	
	//@Query(value = "SELECT * FROM Product p WHERE p.subcategory_id = :subcategoryId",nativeQuery = true)
	//public List<Product> findAllBySubcategoryId(@Param("subcategoryId") int subcategoryId);

	
	public List<Product> findBysubcategoryId(int subcategoryId,Pageable pageable);
	
	public Product findByproductId(int productId);

}

