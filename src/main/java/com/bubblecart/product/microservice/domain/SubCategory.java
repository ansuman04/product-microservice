package com.bubblecart.product.microservice.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Table(name = "subcategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subcategory_id")
    private Integer subcategory_id;

    @Column(name = "category_id")
    private Integer category_id;

    @Column(name = "subcategory_name")
    private String subcategory_name;

    @Column(name = "subcategory_desc")
    private String subcategory_desc;
    
    @Valid
    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name  = "subcategory_id")
    private List<Product> productList;

    public Integer getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(Integer subcategory_id) {
		this.subcategory_id = subcategory_id;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
    }

    public String getSubcategory_desc() {
        return subcategory_desc;
    }

    public void setSubcategory_desc(String subcategory_desc) {
        this.subcategory_desc = subcategory_desc;
    }
    
    public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
    public String toString() {
        return "SubCategory{" +
                "subcategory_id='" + subcategory_id + '\'' +
                ", category_id='" + category_id + '\'' +
                ", subcategory_name='" + subcategory_name + '\'' +
                ", subcategory_desc='" + subcategory_desc + '\'' +
                '}';
    }
}
