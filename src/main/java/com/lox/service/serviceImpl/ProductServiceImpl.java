package com.lox.service.serviceImpl;

import com.lox.entiey.ProductInfo;
import com.lox.enums.ProductStatusEnum;
import com.lox.repository.ProductInfoRepository;
import com.lox.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LOX
 * @description
 * @date 2019/9/22
 */
@Service
public class ProductServiceImpl implements ProductService {
 @Autowired
 private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).get();

    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo ProductInfo) {
        return repository.save(ProductInfo);
    }
}
