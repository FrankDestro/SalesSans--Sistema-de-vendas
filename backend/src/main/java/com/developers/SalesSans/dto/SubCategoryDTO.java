package com.developers.SalesSans.dto;

import com.developers.SalesSans.entities.Category;
import com.developers.SalesSans.entities.SubCategory;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.security.PublicKey;

public class SubCategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String description;
    private Long category;

    public SubCategoryDTO() {
    }

    public SubCategoryDTO(Long id, String description, Long category) {
        this.id = id;
        this.description = description;
        this.category = category;
    }

    public SubCategoryDTO(SubCategory entity) {
        id = entity.getId();
        description = entity.getDescription();
        category = entity.getCategory().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }
}
