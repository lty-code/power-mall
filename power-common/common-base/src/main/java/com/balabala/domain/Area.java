package com.balabala.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//swagger依赖
@ApiModel(value="com-balabala-domain-Area")
//lombok依赖
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//mybatisplus annocation依赖
@TableName(value = "area")
public class Area implements Serializable {
    @TableId(value = "area_id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long areaId;

    @TableField(value = "area_name")
    @ApiModelProperty(value="")
    private String areaName;

    @TableField(value = "parent_id")
    @ApiModelProperty(value="")
    private Long parentId;

    @TableField(value = "level")
    @ApiModelProperty(value="")
    private Integer level;

    private static final long serialVersionUID = 1L;
}