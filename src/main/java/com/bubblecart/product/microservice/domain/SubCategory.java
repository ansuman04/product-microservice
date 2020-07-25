package com.bubblecart.product.microservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "subcategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subcategory_id")
    private String subcategory_id;

    @Column(name = "category_id")
    private String category_id;

    @Column(name = "subcategory_name")
    private String subcategory_name;

    @Column(name = "subcategory_desc")
    private String subcategory_desc;

    public String getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(String subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
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
