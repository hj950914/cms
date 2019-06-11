package com.jluster.cms;

import com.jluster.cms.entity.UserTest;
import org.junit.Test;

/**
 * Author: hj
 * Date: 2019-06-11 16:13
 * Description: <描述>
 */
public class Test1 {

    @Test
    public void testEquals() {
        UserTest user1 = new UserTest("hj", "12345c");
        UserTest user2 = new UserTest("hj", "12345c");
        System.out.println(user1.equals(user2));
    }
}
