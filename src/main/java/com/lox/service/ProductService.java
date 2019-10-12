package com.lox.service;

import com.lox.entiey.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);
    /**
     *功能模块描述
     * @author lox
     * @date 2019/10/8
     * @param
     * @return java.util.List<com.lox.entiey.ProductInfo>
     *     查询所有的在线商品
     */
    List<ProductInfo> findUpAll ();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo ProductInfo);
    //加库存

    //减库存
}
