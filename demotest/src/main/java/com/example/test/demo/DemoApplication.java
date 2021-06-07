package com.example.test.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.Console;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {

        //BinarySearch binarySearch = new BinarySearch(new QuickSearch());

        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        BinarySearch bean = applicationContext.getBean(BinarySearch.class);
        BinarySearch bean1 = applicationContext.getBean(BinarySearch.class);
        int[] res = bean.binarySearch(new int[] {1,2,3},3);

        LOGGER.info("BEan {}", bean);
        LOGGER.info("sort {}", bean.getSortAlgorithm());

        LOGGER.info("Bean1 {}", bean1);
        LOGGER.info("Bean1 {}", bean1.getSortAlgorithm());

        System.out.println(Arrays.toString(res));

    }

}
