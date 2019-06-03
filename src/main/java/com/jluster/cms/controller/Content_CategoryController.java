package com.jluster.cms.controller;

import com.jluster.cms.entity.Content_Category;
import com.jluster.cms.service.Content_CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Author: hj
 * Date: 2019-06-03 14:49
 * Description: <描述>
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(produces = APPLICATION_JSON_UTF8_VALUE)
@Api(value = "api接口", description = "内容分类管理的相关操作")
public class Content_CategoryController {

    private final Content_CategoryService content_categoryService;

    @PostMapping(value = "/addContentCategory", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "新增内容分类服务", notes = "")
    public void addContentCategory(@ApiParam(value = "内容分类的信息") @RequestBody Content_Category content_category) {
        content_categoryService.createContent_Category(content_category);
    }

    @DeleteMapping("/deleteByIdContentCategory/{id}")
    @ApiOperation(value = "删除内容分类服务", notes = "根据内容分类的主键删除内容分类")
    public void deleteByIdContentCategory(@ApiParam(value = "内容分类的主键id") @PathVariable Long id) {
        content_categoryService.subContent_Category(id);
    }

    @PutMapping(value = "/updateByIdContentCategory/{id}", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "修改内容分类服务", notes = "根据内容分类的主键修改内容分类")
    public String updateByIdContentCategory(@ApiParam(value = "内容分类的主键id") @PathVariable Long id, @ApiParam(value = "新的内容分类") @RequestBody Content_Category content_category) {
        return content_categoryService.replaceContent_Category(id, content_category);
    }

    @GetMapping("/findAllContentCategory")
    @ApiOperation(value = "查询所有内容分类服务")
    public List<Content_Category> findAllContentCategory() {
        return content_categoryService.findAllContent_Category();
    }
}
