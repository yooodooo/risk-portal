package com.github.risk.portal.admin.model;

import com.github.risk.portal.admin.common.BaseVO;
import lombok.Data;

/**
 * @author dong.yang
 * @date 2021/7/6 15:25
 */
@Data
public class EventVO extends BaseVO {
    private String code;
    private String name;
    private String invokeType;
    private Integer status;
}
