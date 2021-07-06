package com.github.risk.portal.admin.api;

import com.github.risk.portal.api.admin.EventApi;
import com.github.risk.portal.api.model.EventConfig;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author dong.yang
 * @date 2021/7/5 18:01
 */
@DubboService(version = "${dubbo.version.event:1.0.0}", validation = "true")
public class AdminEventApi implements EventApi {

    @Override
    public EventConfig eventConfig(Long eventId) {
        EventConfig eventConfig = new EventConfig();
        eventConfig.setEventId(eventId);
        eventConfig.setCode("event-code-" + eventId);
        return eventConfig;
    }
}
