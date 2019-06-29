package com.jluster.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: hj
 * Date: 2019-06-29 18:18
 * Description: 添加bean到ioc容器中,通过配置方式@Configuration
 */
@Configuration
public class Bean2Config {

    @Bean
    public Bean2Config setBean() {
        return new Bean2Config();
    }

    public void printTest() {
        System.out.println("Bean2Config输出方法。。。。。。");
    }
}
