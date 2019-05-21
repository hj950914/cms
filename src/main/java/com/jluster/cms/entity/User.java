package com.jluster.cms.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Author: hj
 * Date: 2019-05-21 14:04
 * Description: 用户实体
 */
@Data
public class User {

    private Long id;//id

    @NotNull
    @Length(min = 1, max = 10)
    private String login;//用户名

    @NotNull
    @Length(min = 10, max = 20)
    private String email;//邮箱

    @NotNull
    @Length(min = 11, max = 11)
    private String phone;//手机号

    @NotNull
    private String password;//密码

    private String status;//用户状态

    @NotNull
    @Length(min = 1, max = 8)
    private String nick_name;//昵称

    private String created_by;//创建人

    private String modified_by;//更新人

    private Date created_time;//创建时间

    private Date modified_time;//更新时间
}
