package com.jluster.cms.controller;

import com.jluster.cms.entity.User;
import com.jluster.cms.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Author: hj
 * Date: 2019-05-21 14:53
 * Description: <描述>
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(produces = APPLICATION_JSON_UTF8_VALUE)
@Api(value = "api接口", description = "用户相关操作")
public class UserController {

    private final UserService userService;


    @PostMapping(value = "/addUser", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "用户注册服务", notes = "根据用户填写的信息来注册用户")
    public void addUser(@ApiParam(value = "用户的信息") @RequestBody @Valid User user) {
        userService.createUser(user);
    }


    @GetMapping(value = "/loginUser", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "用户登录服务", notes = "根据用户填写的用户名或者邮箱登录")
    public User loginUser(@ApiParam(value = "用户的用户名或者邮箱") @RequestBody User user) {
        return userService.findUser(user);
    }


    @PutMapping(value = "/updateByIdUser/{id}", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "用户信息修改服务", notes = "根据用户的id来修改用户的昵称")
    public String updateByIdUser(@ApiParam(value = "用户id") @PathVariable Long id, @ApiParam(value = "新的昵称") @RequestBody String nick_name) {
        return userService.replaceUser(id, nick_name);
    }


    @DeleteMapping("/deleteByIdUser/{id}")
    @ApiOperation(value = "用户删除服务", notes = "根据用户id删除用户")
    public void deleteByIdUser(@ApiParam(value = "用户id") @PathVariable Long id) {
        userService.subUser(id);
    }
}
