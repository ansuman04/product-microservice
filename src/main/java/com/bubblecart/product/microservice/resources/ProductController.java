package com.bubblecart.product.microservice.resources;
import com.bubblecart.product.microservice.domain.Category;
import com.bubblecart.product.microservice.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController
{

   @Autowired
   private CategoryRepository categoryRepository;

   @RequestMapping("/categories")
   public List<Category> getAllCategories() {
       return categoryRepository.findAll();
   }
}
