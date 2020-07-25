package com.bubblecart.product.microservice.repo;

import com.bubblecart.product.microservice.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
