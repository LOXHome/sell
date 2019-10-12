package com.lox.repository;

import com.lox.entiey.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LOX
 * @description dao
 * @date 2019/9/22
 */
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

      List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList);
}
