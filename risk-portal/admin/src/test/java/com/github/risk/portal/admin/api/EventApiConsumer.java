package com.github.risk.portal.admin.api;

import com.github.risk.portal.api.admin.EventApi;
import com.github.risk.portal.api.model.EventConfig;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dong.yang
 * @date 2021/7/6 10:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:dubbo-consumer-context.xml"
})
public class EventApiConsumer {

    @DubboReference(version = "1.0.0", timeout = 1000)
    private EventApi eventApi;

    @Test
    public void testGetEventConfig() {
        EventConfig eventConfig = eventApi.eventConfig(1L);
        Assert.assertEquals("", 1l, eventConfig.getEventId().longValue());
    }
}
