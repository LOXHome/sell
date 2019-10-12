package com.lox.entiey;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author LOX
 * @description 订单详情entity
 * @date 2019/10/10
 */
@Entity
@Data
public class OrderDetail {
     @Id
     //订单详情ID
    private  String detailId;
    //订单ID
    private  String orderId;
    //商品ID
    private  String productId;
    //商品名称
    private  String productName;
    //当前价格,单位分
    private BigDecimal productPrice;
    //数量
    private  Integer productQuantity;
    //小图
    private  String productIcon;


}
