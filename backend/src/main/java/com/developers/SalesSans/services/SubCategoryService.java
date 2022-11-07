package com.developers.SalesSans.services;

import com.developers.SalesSans.dto.SubCategoryDTO;
import com.developers.SalesSans.entities.SubCategory;
import com.developers.SalesSans.repositories.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Transactional(readOnly = true)
    public Page<SubCategoryDTO> findAllSubCategoryPaged(Pageable pageable) {

        Page<SubCategory> list = subCategoryRepository.findAll(pageable);
        return list.map(x -> new SubCategoryDTO(x));
    }
}
