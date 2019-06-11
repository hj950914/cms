package com.jluster.cms.mapper;

import com.jluster.cms.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: hj
 * Date: 2019-05-21 14:19
 * Description: 用户表映射接口
 */
@Mapper
public interface UserMapper {

    /**
     * 新增用户
     *
     * @param user
     */
    public void insertUser(User user);

    /**
     * 删除用户
     *
     * @param id
     */
    public void deleteUser(Long id);

    /**
     * 修改用户昵称
     *
     * @param
     */
    public Integer updateUser(User user);

    /**
     * 查找单个用户
     *
     * @param user
     * @return
     */
    public User selectUser(User user);

    /**
     * 根据用户id查找用户
     *
     * @param id
     * @return
     */
    public User selectUserById(Long id);
}
