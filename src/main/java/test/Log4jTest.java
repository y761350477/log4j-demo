package test;

import org.apache.log4j.Logger;

public class Log4jTest {

    private static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        // 计算耗时_毫秒 Created by YC.
        calculate_ms();
        // 计算耗时_纳秒 Created by YC.
        calculate_ns();
        // log4j使用 Created by YC.
        log4j_info();
    }

    private static void log4j_info() {
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }

    /**
     * 计算耗时_纳秒
     *
     * @author YC
     * @create 2018/4/7 16:20.
     */
    private static void calculate_ns() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            System.out.println("当前是：" + i);
        }
        long endTime = System.nanoTime();
        logger.info("当前程序耗时(ns)：" + (endTime - startTime) + "ns");
    }

    /**
     * 计算耗时_毫秒
     *
     * @author YC
     * @create 2018/4/7 16:20.
     */
    private static void calculate_ms() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
//            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        logger.info("当前程序耗时(ms)：" + (endTime - startTime) + "ms");
    }

}

