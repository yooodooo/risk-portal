package com.github.risk.portal.gateway.controller;

import com.github.risk.portal.gateway.config.SystemProperties;
import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dong.yang
 * @date 2021/6/10 17:41
 */
@RestController
public class ConfigController {

    @Resource
    SystemProperties systemProperties;

    @GetMapping("/config")
    public Object config() {
        return ImmutableMap.of("security", systemProperties.getSecurity(), "methods", systemProperties.getMethods(), "map", systemProperties.getMap());
    }
}
