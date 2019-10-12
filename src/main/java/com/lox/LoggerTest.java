package com.lox;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author LOX
 * @description 日志测试类
 * @date 2019/9/16
 */
//@RunWith(SpringRunner.class)
@Slf4j
public class LoggerTest {
 // private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public  void test1(){
//        logger.debug("debug....");
//        logger.info("info....");
//        logger.error("error....");
        String usernmae="lox";
        String password="1314";
        log.debug("debug....");
        log.info("info .. username:"+usernmae+"   password:"+password);
        log.info("info....username: {}, password: {}",usernmae,password);
        log.error("error....");
    }
}
