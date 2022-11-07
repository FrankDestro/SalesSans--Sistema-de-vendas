package com.developers.SalesSans.resources;

import com.developers.SalesSans.dto.CategoryDTO;
import com.developers.SalesSans.dto.SubCategoryDTO;
import com.developers.SalesSans.services.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/subcategory")
public class SubcategoryResource {

    @Autowired
    private SubCategoryService SubCategoryservice;

    @GetMapping
    public ResponseEntity<Page<SubCategoryDTO>> findAll(Pageable pageable) {
        Page<SubCategoryDTO> list = SubCategoryservice.findAllSubCategoryPaged(pageable);
        return ResponseEntity.ok().body(list);
    }
}
