package com.github.risk.portal.cache;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dong.yang
 * @date 2021/7/7 10:23
 */
@ConfigurationProperties(prefix = RiskCacheProperties.PREFIX)
public class RiskCacheProperties {

    public static final String PREFIX = "risk.cache";

    private Provider provider = new Provider();

    private Consumer consumer = new Consumer();


    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public static class Provider {
        private boolean enabled;
        private String zookeeperAddress;
        private int sessionTimeout;
        private int connectionTimeout;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getZookeeperAddress() {
            return zookeeperAddress;
        }

        public void setZookeeperAddress(String zookeeperAddress) {
            this.zookeeperAddress = zookeeperAddress;
        }

        public int getSessionTimeout() {
            return sessionTimeout;
        }

        public void setSessionTimeout(int sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
        }

        public int getConnectionTimeout() {
            return connectionTimeout;
        }

        public void setConnectionTimeout(int connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
        }
    }

    public static class Consumer extends Provider {

    }

}
