package com.lox.enums;

import lombok.Getter;

/**
 *功能模块描述 :商品状态
 * @author lox
 * @date 2019/10/8
 * @param null
 * @return
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"商品在架"),
    DOWN(1,"商品已下架")
            ;
        private  Integer code;
        private  String message;
        ProductStatusEnum(Integer code,String message){
            this.code=code;
            this.message=message;
        }
}
