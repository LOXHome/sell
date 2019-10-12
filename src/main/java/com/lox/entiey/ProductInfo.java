package com.lox.entiey;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author LOX
 * @description 商品entity
 * @date 2019/10/8
 */
@Entity
@Data
//@ApiModel
public class ProductInfo {
    @Id
    private String productId;
//    @ApiModelProperty(name = "商品名称")
    private String productName;
//    @ApiModelProperty(name = "商品单价")
    private BigDecimal productPrice;
//    @ApiModelProperty(name = "商品库存")
    private Integer productStock;
//    @ApiModelProperty(name = "商品描述")
    private  String productDescription;
//    @ApiModelProperty(name = "商品小图")
    private  String productIcon;
//    @ApiModelProperty(name = "商品状态,0正常1下架")
    private  Integer productStatus;
//    @ApiModelProperty(name = "商品类目编号")
    private  Integer categoryType;
}
