package com.my.blog.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  //开启事务支持
public class CoreApplication {


    public static void main(String[] args) {
        SpringApplication.run(CoreApplicationInit.class, args);
    }
}
