package com.bubblecart.product.microservice.service;

import com.bubblecart.product.microservice.domain.Category;
import com.bubblecart.product.microservice.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    Page<Category> findAll(Pageable pageable){
        return categoryRepository.findAll(pageable);

    }
}

