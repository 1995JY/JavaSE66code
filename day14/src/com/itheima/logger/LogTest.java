package com.itheima.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("JyWeng");
        logger.info("记录了一条日志");
    }
}
