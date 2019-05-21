package com.jluster.cms.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jluster.cms.entity.User;
import com.jluster.cms.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Author: hj
 * Date: 2019-05-21 14:14
 * Description: 用户业务
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 添加用户
     *
     * @param user
     */
    public void createUser(User user) {
        userMapper.insertUser(user);
    }

    /**
     * 查找用户
     *
     * @param user
     * @return
     */
    public User findUser(User user) {
        User user1 = userMapper.selectUser(user);
        return user1;
    }

    /**
     * 修改用户昵称
     *
     * @param
     */
    public String replaceUser(Long id, String nick_name) {
        User user = null;
        //将json格式转换
        try {
            user = objectMapper.readValue(nick_name, User.class);
            user.setId(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer status = userMapper.updateUser(user);
        if (status == 1) {
            System.out.println("********************" + "更新成功");
            return "更新成功";
        } else {
            System.out.println("********************" + "更新失败");
            return "更新失败";
        }
    }

    /**
     * 根据用户id删除用户
     *
     * @param id
     */
    public void subUser(Long id) {
        userMapper.deleteUser(id);
    }

}