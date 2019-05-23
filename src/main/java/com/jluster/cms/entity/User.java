package com.jluster.cms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * Author: hj
 * Date: 2019-05-21 14:04
 * Description: 用户实体
 */
@Data
public class User {


    @ApiModelProperty(value = "用户id编号")
    private Long id;


    @ApiModelProperty(value = "用户名", notes = "验证规则^[0-9a-zA-Z_]{4,16}$")
    @Pattern(regexp = "^[0-9a-zA-Z_]{4,16}$")
    private String login;


    @ApiModelProperty(value = "邮箱", notes = "验证规则^[a-z,A-Z,0-9]+([-_.][a-z,A-Z,0-9]+)*@([a-z,A-Z,0-9]+[-.])+[a-z,A-Z,0-9]{2,4}$")
    @Pattern(regexp = "^[a-z,A-Z,0-9]+([-_.][a-z,A-Z,0-9]+)*@([a-z,A-Z,0-9]+[-.])+[a-z,A-Z,0-9]{2,4}$")
    private String email;


    @ApiModelProperty(value = "手机号", notes = "验证规则^1[3,4,5,7,8][0-9]{9}$")
    @Pattern(regexp = "^1[3,4,5,7,8][0-9]{9}$")
    private String phone;


    @ApiModelProperty(value = "密码", notes = "验证规则^[0-9a-zA-Z_]{6,20}$")
    @Pattern(regexp = "^[0-9a-zA-Z_]{6,20}$")
    private String password;


    @ApiModelProperty(value = "用户状态")
    private String status;


    @ApiModelProperty(value = "昵称", notes = "验证规则^[\\u4e00-\\u9fa5]{4,8}$")
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{4,8}$")
    private String nick_name;


    @ApiModelProperty(value = "创建人")
    private String created_by;


    @ApiModelProperty(value = "更新人")
    private String modified_by;


    @ApiModelProperty(value = "创建时间")
    private Date created_time;


    @ApiModelProperty(value = "更新时间")
    private Date modified_time;

}
