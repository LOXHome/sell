package com.lox.Controller;

import com.lox.Utils.ResultVOUtils;
import com.lox.VO.ProductInfoVO;
import com.lox.VO.ProductVO;
import com.lox.VO.ResultVO;
import com.lox.entiey.ProductCategory;
import com.lox.entiey.ProductInfo;
import com.lox.service.ProductCategoryService;
import com.lox.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LOX
 * @description 买家相关商品Controller
 * @date 2019/10/8
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
   @Autowired
   private ProductService productService;
   @Autowired
   private ProductCategoryService categoryService;
    @GetMapping("/list")
    public ResultVO list(){
        //1.查询所有商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //2.询所商品有类目
        List<Integer > ProductCategoryTypeList=new ArrayList<>();
        // 方法一：
        //所有商品的类目
        for (ProductInfo info: productInfoList){
            ProductCategoryTypeList.add(info.getCategoryType());
        }
        List<ProductCategory> categoryTypeList = categoryService.findByCategoryTypeIn(ProductCategoryTypeList);

        //拼接数据
        List<ProductVO> productVOList=new ArrayList<>();
        for (ProductCategory productCategory: categoryTypeList){
                ProductVO productVO=new ProductVO();
                productVO.setCategoryName(productCategory.getCategoryName());
                productVO.setCategoryType(productCategory.getCategoryType());
               List<ProductInfoVO> productInfoVOList=new ArrayList<>();
                for (ProductInfo info2:productInfoList){
                    if (productCategory.getCategoryType()==info2.getCategoryType()){
                        ProductInfoVO productInfoVO=new ProductInfoVO();
                        BeanUtils.copyProperties(info2,productInfoVO);
                        productInfoVOList.add(productInfoVO);
                    }
                }
               productVO.setProductInfoVOList(productInfoVOList);
                productVOList.add(productVO);
           }
        return ResultVOUtils.success(productVOList);
    }
}
