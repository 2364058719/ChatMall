package com.abin.mallchat.common.chat.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 房间表
 * </p>
 *
 * @author <a href="https://github.com/zongzibinbin">abin</a>
 * @since 2023-07-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("room")
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 群名称
     */
    @TableField("name")
    private String name;

    /**
     * 群头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 房间类型 1群聊
     */
    @TableField("type")
    private Integer type;

    /**
     * 是否全员展示 0否 1是
     */
    @TableField("hot_flag")
    private Integer hotFlag;

    /**
     * 群最后消息的更新时间（热点群不需要写扩散，更新这里就行）
     */
    @TableField("active_time")
    private LocalDateTime activeTime;

    /**
     * 额外信息（根据不同类型房间有不同存储的东西）
     */
    @TableField("ext_json")
    private String extJson;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


}
