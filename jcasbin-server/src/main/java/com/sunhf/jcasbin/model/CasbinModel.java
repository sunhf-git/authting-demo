package com.sunhf.jcasbin.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class CasbinModel {

    private Long pid;

    private String id;

    private String modelDef;

    private String modelStatus;

    private Date createTime;

    private Date modifyTime;
}
