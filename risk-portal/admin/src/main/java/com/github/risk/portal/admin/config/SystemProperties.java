package com.github.risk.portal.admin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author dong.yang
 * @date 2021/6/15 10:50
 */
@Component
@RefreshScope
@Data
@ConfigurationProperties(prefix = "system")
public class SystemProperties {

    private List<String> methods;

    private Map<String, List<String>> map;

    private Security security;

    @Data
    public static class Security {
        private String app;
        private String key;
    }
}
