package com.jluster.cms.controller;

import com.jluster.cms.entity.Category;
import com.jluster.cms.service.CategoryService;
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
@Api(value = "api接口", description = "分类管理的相关操作")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping(value = "/addCategory", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "新增分类服务", notes = "")
    public void addCategory(@ApiParam(value = "分类的信息") @RequestBody Category category) {
        categoryService.createCategory(category);
    }

    @DeleteMapping("/deleteByIdCategory/{id}")
    @ApiOperation(value = "删除分类服务", notes = "根据分类的主键删除分类")
    public void deleteByIdCategory(@ApiParam(value = "分类的主键id") @PathVariable Long id) {
        categoryService.subCategory(id);
    }

    @PutMapping(value = "/updateCategory/{id}", consumes = APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "修改分类服务", notes = "根据分类的主键修改分类")
    public String updateByIdCategory(@ApiParam(value = "分类的主键id") @PathVariable Long id, @ApiParam(value = "新的分类") @RequestBody String name) {
        return categoryService.replaceCategory(id, name);
    }

    @GetMapping("/findAllCategory")
    @ApiOperation(value = "查询所有分类服务")
    public List<Category> findAllCategory() {
        return categoryService.findCategory();
    }
}
