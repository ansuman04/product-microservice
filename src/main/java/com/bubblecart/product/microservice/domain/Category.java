package com.bubblecart.product.microservice.domain;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.List;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id")
    private Integer categoryId;

    @Column(name="category_name")
    private String categoryName;

    @Column(name="category_description")
    private String categoryDescription;

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private List<SubCategory> subCategoryList;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public List<SubCategory> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(List<SubCategory> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }
}
