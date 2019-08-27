package com.zl.hrm.dao;

import com.zl.hrm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    //插入员工
    void insertUser(User user);

    //用户登录名和密码查询员工
    User selectByLoginNameAndPwd(@Param("loginName")String loginName,@Param("loginPwd")String loginPwd);

    //根据用户id查询用户
    User selectById(@Param("userId") Integer userId);

    //根据用户id删除用户
    void deleteById(@Param("userId") Integer userId);

    //修改用户信息
    void updateByParam(@Param("user") User user);

}
