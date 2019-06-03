package com.jluster.cms.service;

import com.jluster.cms.entity.Content_Category;
import com.jluster.cms.mapper.Content_CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: hj
 * Date: 2019-06-03 18:11
 * Description: 内容分类管理相关业务
 */
@Service
@RequiredArgsConstructor
public class Content_CategoryService {

    private final Content_CategoryMapper content_categoryMapper;

    /**
     * 新增内容分类
     *
     * @param content_category
     */
    public void createContent_Category(Content_Category content_category) {
        content_categoryMapper.insertContent_Category(content_category);
    }

    /**
     * 删除内容分类
     *
     * @param id
     */
    public void subContent_Category(Long id) {
        content_categoryMapper.deleteContent_Category(id);
    }

    /**
     * 修改内容分类
     *
     * @param id,content_category
     */
    public String replaceContent_Category(Long id, Content_Category content_category) {
        content_category.setId(id);
        Integer flag = content_categoryMapper.updateContent_Category(content_category);
        if (flag == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    /**
     * 查询所有内容分类
     *
     * @return
     */
    public List<Content_Category> findAllContent_Category() {
        return content_categoryMapper.selectContent_Category();
    }
}
