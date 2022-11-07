package com.developers.SalesSans.repositories;

import com.developers.SalesSans.entities.Category;
import com.developers.SalesSans.entities.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

}
