package com.jluster.cms.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jluster.cms.entity.Category;
import com.jluster.cms.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Author: hj
 * Date: 2019-06-03 14:46
 * Description: 分类管理相关业务
 */
@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryMapper categoryMapper;

    private final ObjectMapper objectMapper;

    /**
     * 新增分类
     *
     * @param category
     */
    public void createCategory(Category category) {
        categoryMapper.insertCategory(category);
    }

    /**
     * 删除分类
     *
     * @param id
     */
    public void subCategory(Long id) {
        categoryMapper.deleteCategory(id);
    }

    /**
     * 修改分类名称
     *
     * @param id,name
     */
    public String replaceCategory(Long id, String name) {
        Category category = null;
        Integer status = 0;//是否修改成功的状态
        //把从前端获取到的json格式的字符串转化成对象
        try {
            category = objectMapper.readValue(name, Category.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (category != null) {
            category.setId(id);
            status = categoryMapper.updateCategory(category);
        }
        //状态为1表示修改成功
        if (status == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    /**
     * 查询所有分类
     *
     * @return
     */
    public List<Category> findCategory() {
        List<Category> categories = categoryMapper.selectCategory();
        if (categories != null) {
            return categories;
        } else {
            return null;
        }
    }
}
