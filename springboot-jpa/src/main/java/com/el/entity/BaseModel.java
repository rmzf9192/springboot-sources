package com.el.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * <pre>
 *     JPA数据实体类的基础类，用于唯一ID生成策略绑定
 *     审计字段、版本和逻辑删除标记，
 *     未来扩展租户ID信息
 * </pre>
 *
 * @author Moz
 * @date 3/17/2020
 */
@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("记录唯一ID")
    @Column()
    private Long id;

    @ApiModelProperty(value = "租户ID")
    @Column()
    @JsonSerialize(using = ToStringSerializer.class)
    Long tenantId;

    @ApiModelProperty(value = "备注")
    @Column()
    private String remark;

    @ApiModelProperty("记录创建者ID")
    @Column(updatable = false)
    @JsonSerialize(using = ToStringSerializer.class)
    private Long createUserId = 0L;

    @CreatedBy
    @ApiModelProperty("记录创建者")
    @Column()
    private String creator;

    @CreatedDate
    @ApiModelProperty("记录创建时间")
    @Column(updatable = false)
    private LocalDateTime createTime = LocalDateTime.now();

    @ApiModelProperty("记录最后更新者ID")
    @Column()
    @JsonSerialize(using = ToStringSerializer.class)
    private Long modifyUserId = 0L;

    @LastModifiedBy
    @ApiModelProperty("记录最后更新者")
    @Column()
    String updater;

    @LastModifiedDate
    @ApiModelProperty("记录最后更新时间")
    @Column()
    private LocalDateTime modifyTime = LocalDateTime.now();

    @ApiModelProperty(value = "逻辑删除，0：未删除，1：已删除")
    @Column()
    private Integer deleteFlag;


    @ApiModelProperty(value = "锁版本")
    @Column()
    private Integer auditDataVersion;
}
