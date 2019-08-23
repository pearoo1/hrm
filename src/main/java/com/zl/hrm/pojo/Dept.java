package com.zl.hrm.pojo;

import lombok.*;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("dept")
public class Dept implements Serializable {
    private Integer deptId;//部门编号
    private String  deptName;//部门名字
    private String  deptRemark;//备注
}
