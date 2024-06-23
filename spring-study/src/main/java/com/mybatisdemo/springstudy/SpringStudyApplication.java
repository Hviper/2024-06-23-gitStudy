package com.mybatisdemo.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStudyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringStudyApplication.class, args);
        System.out.println("在家里进行的开发，公司可以看到吗？？");
        System.out.println("我在家解决了冲突， 你在公司需要解决冲突吗？");
        SpringApplication.run(SpringStudyApplication.class, args);
        System.out.println("hello,world");
        System.out.println("home dev1");
    }
    public void homeUpdate(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

}
