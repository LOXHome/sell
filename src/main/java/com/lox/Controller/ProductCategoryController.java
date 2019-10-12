package com.lox.Controller;

import com.lox.entiey.ProductCategory;
import com.lox.service.ProductCategoryService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LOX
 * @description
 * @date 2019/9/22
 */
@RestController
@Api(value = "/ProductCategoryController", description = "商品类型")
@RequestMapping("/sell")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService service;

    @ApiOperation(value = "所有的商品类型", notes = "商品类型")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    //  @ApiImplicitParam(value = "",name = "",dataType = "String",required =true,paramType ="query")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful — 请求已完成"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")}
    )
    public List selectAll() {
        return service.findAll();
    }


    @ApiOperation(value = "查找商品类型", notes = "商品类型")
    //  @ApiImplicitParam(value = "CategoryTypeList",name = "商品类型ID",dataType = "Integer",required =true,paramType ="query")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful — 请求已完成"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")}
    )
    @RequestMapping(value = "/findByCategoryType", method = RequestMethod.GET)
    List<ProductCategory> findByCategoryTypeIn(@RequestParam List<Integer> CategoryTypeList) {

        return service.findByCategoryTypeIn(CategoryTypeList);
    }


    @ApiOperation(value = "保存商品类型", notes = "商品类型")
    @ApiImplicitParam(value = "productCategory", name = "商品类型", dataType = "String", required = true, paramType = "query")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful — 请求已完成"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")}
    )
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ProductCategory save(@RequestBody ProductCategory productCategory) {
        return service.save(productCategory);
    }


    @ApiOperation(value = "查找某个商品类型", notes = "商品类型")
 //   @ApiImplicitParam(value = "商品ID", name = "categoryId", dataType = "Integer", required = true, paramType = "query")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful — 请求已完成"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")}
    )
    @RequestMapping(value = "findOne", method = RequestMethod.GET)
    public ProductCategory findOne(@RequestParam("categoryId") Integer categoryId) {
        return service.findOne(categoryId);
    }

}
