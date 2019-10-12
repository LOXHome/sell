package com.lox.repository;

import com.lox.entiey.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *订单dao
 * @author lox
 * @date 2019/10/10
 * @param null
 * @return
 */
@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    //查询某个人订单
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid , Pageable pageable);

}
