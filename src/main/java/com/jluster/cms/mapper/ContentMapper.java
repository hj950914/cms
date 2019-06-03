package com.jluster.cms.mapper;

import com.jluster.cms.entity.Content;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: hj
 * Date: 2019-06-03 16:34
 * Description: 内容表映射接口
 */
@Mapper
public interface ContentMapper {

    /**
     * 新增内容
     *
     * @param content
     */
    public void insertContent(Content content);

    /**
     * 根据主键id删除内容
     *
     * @param id
     */
    public void deleteContent(Long id);

    /**
     * 根据主键id修改内容
     *
     * @param content
     * @return
     */
    public Integer updateContent(Content content);

    /**
     * 查询所有内容
     *
     * @return
     */
    public List<Content> selectContent();
}
