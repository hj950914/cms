package com.jluster.cms.mapper;

import com.jluster.cms.entity.Content_Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: hj
 * Date: 2019-06-03 13:46
 * Description: 内容分类映射接口
 */
@Mapper
public interface Content_CategoryMapper {

    /**
     * 新增内容分类
     *
     * @param content_category
     */
    public void insertContent_Category(Content_Category content_category);

    /**
     * 删除内容分类
     *
     * @param id
     */
    public void deleteContent_Category(Long id);

    /**
     * 修改内容分类
     *
     * @param content_category
     */
    public Integer updateContent_Category(Content_Category content_category);

    /**
     * 查询所有内容分类
     *
     * @return
     */
    public List<Content_Category> selectContent_Category();
}
