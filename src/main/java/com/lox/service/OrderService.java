package com.lox.service;

import com.lox.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author LOX
 * @description 订单service
 * @date 2019/10/10
 */
public interface OrderService {
    /* 创建订单*/
    OrderDTO create(OrderDTO orderDTO);
    /* 查询某个订单 */
    OrderDTO findOne(String orderId);
    /*查询订单列表*/
    Page<OrderDTO> findOrderList(String buyerOpenid , Pageable pageable);
    /* 取消订单*/
    OrderDTO cancel(OrderDTO orderDTO);
    /* 支付订单*/
    OrderDTO paid(OrderDTO orderDTO);
    /*完结订单*/
    OrderDTO finished(OrderDTO orderDTO);

}
