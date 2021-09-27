package com.sunhf.jcasbin.controller;

import com.sunhf.jcasbin.entity.AlterCasbinModel;
import com.sunhf.jcasbin.entity.AlterCasbinPolicy;
import com.sunhf.jcasbin.model.CasbinModel;
import com.sunhf.jcasbin.entity.SysUserEnforceEntity;
import com.sunhf.jcasbin.service.EnforcerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class CasbinAuthEndpoint {


    private final EnforcerService enforcerService;

    public CasbinAuthEndpoint(EnforcerService enforcerService) {
        this.enforcerService = enforcerService;
    }

    @PostMapping("/savePolicy")
    public ResponseEntity<String> savePolicy(@RequestBody AlterCasbinPolicy alterCasbinPolicy) {
        return ResponseEntity.of(Optional.of(enforcerService.savePolicy(alterCasbinPolicy.getPolicy())));
    }

    @PostMapping("/removePolicy")
    public ResponseEntity<String> removePolicy(@RequestBody AlterCasbinPolicy alterCasbinPolicy) {
        return ResponseEntity.of(Optional.of(enforcerService.removePolicy(alterCasbinPolicy.getPolicy())));
    }

    @PostMapping("/ask")
    public ResponseEntity<Boolean> askPermission(@RequestBody SysUserEnforceEntity enforceEntity) {
        return ResponseEntity.of(Optional.of(enforcerService.enforceSysUser(enforceEntity)));
    }
}
