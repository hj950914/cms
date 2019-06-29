package com.jluster.cms;

import com.jluster.cms.config.Bean1;
import com.jluster.cms.config.Bean2Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Author: hj
 * Date: 2019-06-29 18:27
 * Description: <描述>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanTets {

    @Resource
    private Bean1 bean1;

    @Resource
    private Bean2Config bean2Config;

    @Test
    public void testBean1(){
        bean1.printTest();
    }

    @Test
    public void testBean2Config(){
        bean2Config.printTest();
    }
}
