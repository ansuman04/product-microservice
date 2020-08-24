package com.bubblecart.product.microservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bubblecart.product.microservice.domain.Category;
import com.bubblecart.product.microservice.repo.CategoryRepository;
import com.bubblecart.product.microservice.request.dto.ProductRequest;
import com.bubblecart.product.microservice.response.dto.ProductDetails;
import com.bubblecart.product.microservice.service.ProductService;

@RestController
public class ProductController
{
   @Autowired
   private CategoryRepository categoryRepository;
   
   @Autowired
   private ProductService productService;

   @RequestMapping(value = "/categories",method = RequestMethod.GET,produces = "application/json")
   public ResponseEntity<List<Category>> getAllCategories() {
       
       List<Category> categoryList = categoryRepository.findAll();       
	   return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
   }
   
   @RequestMapping(value = "/products", method = RequestMethod.POST,produces = "application/json")
   public ResponseEntity<List<ProductDetails>> addEmployee(@RequestBody ProductRequest request,Pageable pageable) {
	   
	   List<ProductDetails> productDetailsList = productService.getAllProducts(request.getSubcategoryId(),pageable);       
	   return new ResponseEntity<List<ProductDetails>>(productDetailsList, HttpStatus.OK);
   }
   
   @RequestMapping(value = "/products/{id}",method = RequestMethod.GET,produces = "application/json")
   public ResponseEntity<ProductDetails> getProductDetails(@PathVariable("id") int id){
	   ProductDetails productDetails = productService.getProductDetails(id);
	   return new ResponseEntity<ProductDetails>(productDetails, HttpStatus.OK);
   }
   
}
