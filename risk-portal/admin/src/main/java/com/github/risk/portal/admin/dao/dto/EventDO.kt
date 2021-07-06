package com.github.risk.portal.admin.dao.dto

import com.baomidou.mybatisplus.annotations.TableField
import com.baomidou.mybatisplus.annotations.TableId
import com.baomidou.mybatisplus.annotations.TableName
import com.baomidou.mybatisplus.enums.FieldFill
import com.baomidou.mybatisplus.enums.FieldStrategy
import com.baomidou.mybatisplus.enums.IdType
import java.util.*

/**
 * @author dong.yang
 * @data 2021/7/6 9:53
 */
@TableName("tm_event")
class EventDO {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Long? = null

    @TableField(fill = FieldFill.INSERT)
    var code: String? = null

    @TableField
    var name: String? = null

    @TableField(value = "invoke_type", strategy = FieldStrategy.IGNORED)
    var invokeType: String? = null

    @TableField(strategy = FieldStrategy.IGNORED)
    var status: Int? = null

    @TableField(value = "data_set_id", fill = FieldFill.INSERT)
    var dataSetId: Int? = null

    @TableField(fill = FieldFill.INSERT)
    var creater: Int? = null

    @TableField(value = "created_at", fill = FieldFill.INSERT)
    var createdAt: Date? = null

    var modifier: Int? = null

    @TableField("updated_at")
    var updatedAt: Date? = null
}