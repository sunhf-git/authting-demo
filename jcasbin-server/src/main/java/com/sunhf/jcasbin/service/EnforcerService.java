package com.sunhf.jcasbin.service;

import com.sunhf.jcasbin.entity.SysUserEnforceEntity;
import com.sunhf.jcasbin.model.CasbinModel;
import lombok.extern.slf4j.Slf4j;
import org.casbin.jcasbin.main.Enforcer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class EnforcerService {

    @Autowired
    private Enforcer enforcer;

    public String savePolicy(String policy) {
        return null;
    }

    public String removePolicy(String policy) {
        return null;
    }

    public Boolean enforceSysUser(SysUserEnforceEntity enforceEntity) {
        return null;
    }
}
