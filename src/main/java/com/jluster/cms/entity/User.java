package com.jluster.cms.entity;

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

    /**
     * 用户id编号
     */
    private Long id;

    /**
     * 用户名
     */
    @Pattern(regexp = "^[0-9a-zA-Z_]{4,16}$")
    private String login;

    /**
     * 邮箱
     */
    @Pattern(regexp = "^[a-z,A-Z,0-9]+([-_.][a-z,A-Z,0-9]+)*@([a-z,A-Z,0-9]+[-.])+[a-z,A-Z,0-9]{2,4}$")
    private String email;

    /**
     * 手机号
     */
    @Pattern(regexp = "^1[3,4,5,7,8][0-9]{9}$")
    private String phone;

    /**
     * 密码
     */
    @Pattern(regexp = "^[0-9a-zA-Z_]{6,20}$")
    private String password;

    /**
     * 用户状态
     */
    private String status;

    /**
     * 昵称
     */
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{4,8}$")
    private String nick_name;

    /**
     * 创建人
     */
    private String created_by;

    /**
     * 更新人
     */
    private String modified_by;

    /**
     * 创建时间
     */
    private Date created_time;

    /**
     * 更新时间
     */
    private Date modified_time;

}
