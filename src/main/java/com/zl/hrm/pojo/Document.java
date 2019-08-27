package com.zl.hrm.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
@Alias("document")
public class Document implements Serializable {
    private Integer documentId;//文件编号
    private String  documentTitle;//标题
    private String  fileName;//文件名
    private MultipartFile file;//文件
    private String documentRemark;//文件描述

}
