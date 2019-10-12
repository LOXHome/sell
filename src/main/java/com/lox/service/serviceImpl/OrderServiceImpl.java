package com.lox.service.serviceImpl;

import com.lox.dto.OrderDTO;
import com.lox.entiey.OrderDetail;
import com.lox.entiey.ProductInfo;
import com.lox.service.OrderService;
import com.lox.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author LOX
 * @description 订单实现server
 * @date 2019/10/10
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductService productService;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //1.查询所有商品（数量，价格）
        for (OrderDetail orderDetail: orderDTO.getOrderDetailList()){
                ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
                if (productInfo==null){
                    throw new Exception();
                }
        }
        //2.计算总金额

        //3.写入订单数据库（OrderMaster,OrderDetail）

        //4.扣库存
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findOrderList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finished(OrderDTO orderDTO) {
        return null;
    }
}
