package com.jluster.cms.controller;

import com.jluster.cms.entity.User;
import com.jluster.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Author: hj
 * Date: 2019-05-21 14:53
 * Description: <描述>
 */
@RestController
@RequestMapping(produces = APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 新增用户
     *
     * @param user
     */
    @PostMapping(value = "/addUser", consumes = APPLICATION_JSON_UTF8_VALUE)
    public void addUser(@RequestBody @Valid User user) {
        userService.createUser(user);
    }

    /**
     * 用户登录
     *
     * @param user
     */
    @GetMapping(value = "/login", consumes = APPLICATION_JSON_UTF8_VALUE)
    public User login(@RequestBody User user) {
        return userService.findUser(user);
    }

    /**
     * 修改用户昵称
     *
     * @param id
     * @param
     * @return
     */
    @PutMapping(value = "/update/{id}", consumes = APPLICATION_JSON_UTF8_VALUE)
    public String update(@PathVariable Long id, @RequestBody String nick_name) {
        return userService.replaceUser(id, nick_name);
    }

    /**
     * 删除单个用户
     *
     * @param id
     */
    @RequestMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.subUser(id);
    }
}
