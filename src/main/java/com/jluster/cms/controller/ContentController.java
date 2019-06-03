package com.jluster.cms.controller;

import com.jluster.cms.entity.Content;
import com.jluster.cms.service.ContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Author: hj
 * Date: 2019-06-03 17:04
 * Description: <描述>
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(produces = APPLICATION_JSON_UTF8_VALUE)
@Api(value = "api接口", description = "内容管理的相关操作")
public class ContentController {

    private final ContentService contentService;

    @PostMapping(value = "/addContent", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "新增内容服务", notes = "")
    public void addContent(@ApiParam(value = "内容的信息") @RequestBody Content content) {
        contentService.createContent(content);
    }

    @DeleteMapping("/deleteByIdContent/{id}")
    @ApiOperation(value = "删除内容服务", notes = "根据内容的主键删除内容")
    public void deleteByIdContent(@ApiParam(value = "内容的主键id") @PathVariable Long id) {
        contentService.subContent(id);
    }

    @PutMapping(value = "/updateByIdContent/{id}", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "修改内容服务", notes = "根据内容的主键修改内容(可修改标题,摘要,描述,正文)")
    public String updateByIdContent(@ApiParam(value = "内容的主键id") @PathVariable Long id, @ApiParam(value = "新的内容") @RequestBody Content content) {
        return contentService.replaceContent(id, content);
    }

    @GetMapping("/findAllContent")
    @ApiOperation(value = "查询所有内容服务")
    public List<Content> findAllContent() {
        return contentService.findAllContent();
    }
}
