package com.lox.service;

import com.lox.entiey.ProductCategory;

import java.util.List;

/**
 * @author LOX
 * @description
 * @date 2019/9/22
 */
public interface ProductCategoryService {
     public List<ProductCategory> findAll();
     public ProductCategory findOne(Integer categoryId);
     List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList);
     public ProductCategory save(ProductCategory productCategory);
}
