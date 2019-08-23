package com.zl.hrm.pojo;

import lombok.Data;

@Data
public class Job {
    private Integer jobId; //职位编号
    private String jobName; //职位名称
    private String jobRemark; //职位描述
}
