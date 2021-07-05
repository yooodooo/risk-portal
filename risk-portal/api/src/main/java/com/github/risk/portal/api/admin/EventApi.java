package com.github.risk.portal.api.admin;

import com.github.risk.portal.api.model.EventConfig;

/**
 * @author dong.yang
 * @date 2021/7/5 17:22
 */
public interface EventApi {

    EventConfig eventConfig(Long eventId);
}
