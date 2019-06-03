package com.jluster.cms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Author: hj
 * Date: 2019-06-03 16:26
 * Description: 内容实体
 */
@Data
public class Content {

    @ApiModelProperty(value = "内容主键")
    private Long id;

    @ApiModelProperty(value = "序列号")
    private String sn;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "摘要")
    private String summary;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "正文")
    private String body;

    @ApiModelProperty(value = "正文格式")
    private String format;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "创建人")
    private String created_by;

    @ApiModelProperty(value = "更新人")
    private String modified_by;

    @ApiModelProperty(value = "创建时间")
    private Date created_time;

    @ApiModelProperty(value = "更新时间")
    private Date modified_time;
}
