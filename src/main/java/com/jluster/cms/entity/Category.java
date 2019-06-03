package com.jluster.cms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Author: hj
 * Date: 2019-06-03 13:29
 * Description: 分类实体
 */
@Data
public class Category {

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "父级分类id")
    private Long parentId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "编号")
    private String code;

    @ApiModelProperty(value = "层级")
    private Long level;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "排序")
    private String sort;

    @ApiModelProperty(value = "创建人")
    private String created_by;

    @ApiModelProperty(value = "更新人")
    private String modified_by;

    @ApiModelProperty(value = "创建时间")
    private Date created_time;

    @ApiModelProperty(value = "更新时间")
    private Date modified_time;
}
