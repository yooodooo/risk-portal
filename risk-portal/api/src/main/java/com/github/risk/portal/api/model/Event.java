package com.github.risk.portal.api.model;

import lombok.Data;

import java.util.Date;
import java.util.Map;

/**
 * @author dong.yang
 * @date 2021/7/5 16:57
 */
@Data
public class Event {
    private String id;
    private String code;
    private Date time;
    private String channel;
    private String invokeType;
    private Map<String, Object> properties;
}
