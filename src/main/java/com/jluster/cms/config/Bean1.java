package com.jluster.cms.config;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: hj
 * Date: 2019-06-29 18:01
 * Description: Bean的生命周期
 */
@Component
public class Bean1 {

    public Bean1() {
        System.out.println("构造方法执行。。。。。");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法执行。。。。。");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁方法执行。。。。。。");
    }

    public void printTest(){
        System.out.println("使用这个bean的方法。。。。。");
    }
}
