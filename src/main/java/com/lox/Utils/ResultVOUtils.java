package com.lox.Utils;

import com.lox.VO.ResultVO;

/**
 * @author LOX
 * @description 结果工具类
 * @date 2019/10/8
 */
public class ResultVOUtils {
    public static ResultVO success(Object object){
         ResultVO resultVO=new ResultVO();
         resultVO.setData(object);
         resultVO.setCode(0);
         resultVO.setMsg("成功");
         return resultVO;
    }

    public  static  ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return  resultVO;
    }

}
