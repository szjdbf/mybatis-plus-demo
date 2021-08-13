package com.zlf.mybatisplusdemo.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("student")
public class Student {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Date birthday;

    private Long levelId;

    @TableLogic
    @TableField
    private Boolean isDelete;

}
