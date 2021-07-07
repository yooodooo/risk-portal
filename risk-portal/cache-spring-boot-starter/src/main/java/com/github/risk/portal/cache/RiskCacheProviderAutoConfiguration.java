package com.github.risk.portal.cache;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author dong.yang
 * @date 2021/7/7 10:34
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnProperty(name = "risk.cache.provider.enabled", matchIfMissing = true)
@EnableConfigurationProperties(RiskCacheProperties.class)
public class RiskCacheProviderAutoConfiguration {

//    @Bean
//    @ConditionalOnMissingBean
//    public RiskCacheProperties nacosConfigProperties() {
//        return new RiskCacheProperties();
//    }
}
