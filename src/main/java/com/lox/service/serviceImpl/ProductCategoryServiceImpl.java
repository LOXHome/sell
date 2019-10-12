package com.lox.service.serviceImpl;

import com.lox.entiey.ProductCategory;
import com.lox.repository.ProductCategoryRepository;
import com.lox.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LOX
 * @description
 * @date 2019/9/22
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryRepository repository;
    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList) {
        return repository.findByCategoryTypeIn(CategoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {

        return repository.save(productCategory);
    }
}
