package com.sunhf.jcasbin.entity;

import lombok.Data;

@Data
public class SysUserEnforceEntity {

    private String modelId;

    private String unit;

    private String user;

    private String obj;

    private String act;
}
