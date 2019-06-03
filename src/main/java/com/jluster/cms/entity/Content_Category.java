package com.jluster.cms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Author: hj
 * Date: 2019-06-03 17:46
 * Description: 内容分类实体
 */
@Data
public class Content_Category {

    @ApiModelProperty(value = "内容分类id")
    private Long id;

    @ApiModelProperty(value = "内容id")
    private Long content_id;

    @ApiModelProperty(value = "分类id")
    private Long category_id;

    @ApiModelProperty(value = "是否被删除（false-否，true-是")
    private Boolean deleted;

    @ApiModelProperty(value = "创建人")
    private String created_by;

    @ApiModelProperty(value = "更新人")
    private String modified_by;

    @ApiModelProperty(value = "创建时间")
    private Date created_time;

    @ApiModelProperty(value = "更新时间")
    private Date modified_time;
}
