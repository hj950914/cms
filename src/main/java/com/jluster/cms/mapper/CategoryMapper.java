package com.jluster.cms.mapper;

import com.jluster.cms.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: hj
 * Date: 2019-06-03 13:46
 * Description: 类目表映射接口
 */
@Mapper
public interface CategoryMapper {

    /**
     * 新增分类
     *
     * @param category
     */
    public void insertCategory(Category category);

    /**
     * 删除分类
     *
     * @param id
     */
    public void deleteCategory(Long id);

    /**
     * 修改分类名称
     *
     * @param category
     */
    public Integer updateCategory(Category category);

    /**
     * 查询所有分类
     *
     * @return
     */
    public List<Category> selectCategory();
}
