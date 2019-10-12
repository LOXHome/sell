package com.lox.repository;

import com.lox.entiey.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *订单详情dao
 * @author lox
 * @date 2019/10/10
 * @param null
 * @return
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
     //根据订单查询订单详情
     List<OrderDetail> findByOrderId(String OrderId);
}
