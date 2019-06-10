package com.jluster.cms.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jluster.cms.entity.User;
import com.jluster.cms.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Author: hj
 * Date: 2019-05-21 14:14
 * Description: 用户相关业务
 */
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserService {

    private final UserMapper userMapper;

    private final ObjectMapper objectMapper;

    private final StringRedisTemplate srt;

    /**
     * 添加用户
     *
     * @param user
     */
    public void createUser(User user) {
        userMapper.insertUser(user);
        //int i = 1/0;
        System.out.println();
    }

    /**
     * 查找用户
     *
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public User findUser(User user) {
        User u = userMapper.selectUser(user);
        if (u != null) {
            return u;
        } else {
            return null;
        }
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

    /**
     * 把用户登录会话存入redis中
     *
     * @param id        用户id
     * @param sessionId 会话id
     */
    public void addSession(String id, String sessionId) {
        srt.opsForHash().put("session", id, sessionId);
    }

}
