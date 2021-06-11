package com.github.risk.portal.gateway.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dong.yang
 * @date 2021/6/10 17:41
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${security.app}")
    private String projectName;

    @Value("${security.key}")
    private String projectOrg;

    @GetMapping("/config")
    public Object config() {
        return ImmutableMap.of("app", projectName, "key", projectOrg);
    }
}
