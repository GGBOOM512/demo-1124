package com.zjp.demo1124;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 主程序类，程序入口
 *
 * @SpringBootApplication :这是一个SpringBooty应用
 */
@SpringBootApplication(scanBasePackages = "com.zjp")
public class Demo1124Application {
    public static void main(String[] args) {
        //1,返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Demo1124Application.class, args);
        //2,查看容器里面的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Bean
    public void demoStr(){

    }
}
