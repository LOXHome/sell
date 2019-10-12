package com.lox.repository;

import com.lox.entiey.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LOX
 * @description
 * @date 2019/10/8
 */
@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus (Integer productStatus);
}
