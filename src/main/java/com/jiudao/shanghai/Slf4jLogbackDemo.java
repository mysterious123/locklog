package com.jiudao.shanghai;


import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;


/**
 * @Created with IDEA
 * @author:LiWangZhou
 * @Date:2018/8/10/010
 * @Time:11:22
 **/
public class Slf4jLogbackDemo {
    org.slf4j.Logger logger = LoggerFactory.getLogger(Slf4jLogbackDemo.class);
    @Test
    public void test(){
        logger.debug("debug.log..");
        logger.info("debug.log..");
        logger.warn("debug.log..");
        logger.error("error.log");
    }

}
