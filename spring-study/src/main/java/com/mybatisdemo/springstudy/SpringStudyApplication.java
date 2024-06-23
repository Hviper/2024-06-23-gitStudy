package com.mybatisdemo.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStudyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringStudyApplication.class, args);
        System.out.println("在公司进行的开发，家里可以看到吗？？");
        System.out.println("你估计需要解决冲突合并的方式");
    }
}
