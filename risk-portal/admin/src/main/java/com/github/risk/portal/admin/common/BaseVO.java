package com.github.risk.portal.admin.common;

import lombok.Data;

import java.util.Date;

/**
 * @author dong.yang
 * @date 2021/7/6 15:23
 */
@Data
public class BaseVO {
    private Integer id;
    private Integer creater;
    private Date createdAt;
    private Integer modifier;
    private Date updatedAt;
}
