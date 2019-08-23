package com.zl.hrm.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

@Data
@Alias("employee")
public class Employee implements Serializable {
    private Integer employeeId;//员工编号
    private Job job;//职位信息
    private Dept dept;//部门信息
    private String employeeName;//员工姓名
    private String cardId;//身份证号
    private String address;//居住地址
    private String phone;//手机号
    private String qqNumber;//qq账号
    private String email;//邮箱
    private String race;//民族
    private String education;//学历
    private String major;//专业
    private String hobby;//爱好
    private String birthday;//生日
    private String party;//政治面貌
    private String employeeRemark;//备注
    private Date createDate;//建档日期
}

