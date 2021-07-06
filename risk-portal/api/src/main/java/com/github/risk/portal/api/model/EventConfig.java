package com.github.risk.portal.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dong.yang
 * @date 2021/7/5 17:19
 */
@Data
public class EventConfig implements Serializable {
    private Long eventId;
    private String code;
    private String name;
    private Integer status;
    private String type;
    private String dataSet;
}
