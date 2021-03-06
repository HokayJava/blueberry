package com.blueberry.springboot.aop.TestAspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@TestLogger
public class MyTestService2 {
    Logger logger = LoggerFactory.getLogger(MyTestService2.class);

    public String sayHello() {
        logger.info("invoking method sayHello......");
        return "Hello world!";
    }

    @TestTimer
    public int count() {
        logger.info("invoking method count......");
        return 10;
    }
}
