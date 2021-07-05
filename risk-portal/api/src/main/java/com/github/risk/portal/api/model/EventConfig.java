package com.github.risk.portal.api.model;

import lombok.Data;

/**
 * @author dong.yang
 * @date 2021/7/5 17:19
 */
@Data
public class EventConfig {
    private Long eventId;
    private String code;
    private String name;
    private Integer status;
    private String type;
    private String dataSet;
}
