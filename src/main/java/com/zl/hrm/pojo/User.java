package com.zl.hrm.pojo;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

@Data
@Alias("user")
public class User implements Serializable {
    private Integer userId;
    private String userName;//用户名
    private String loginName;//登录名
    private String loginPwd;//登录密码
    private Integer userStatus;//登录状态
    private String userImage;//用户头像
    private Date  createDate;//建档日期
}
