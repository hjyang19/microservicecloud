package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("serial")
public class Dept implements Serializable {// 必须序列化
    private Long deptno;// 主键
    private String dname;// 部门名称
    // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}