package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author BCY
 */
@SpringBootApplication
@EnableSwagger2    // 配置swagger 文档
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
