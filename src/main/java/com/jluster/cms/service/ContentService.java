package com.jluster.cms.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jluster.cms.entity.Content;
import com.jluster.cms.mapper.ContentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: hj
 * Date: 2019-06-03 16:50
 * Description: 内容管理相关业务
 */
@Service
@RequiredArgsConstructor
public class ContentService {

    private final ContentMapper contentMapper;

    private final ObjectMapper objectMapper;

    /**
     * 新增内容
     *
     * @param content
     */
    public void createContent(Content content) {
        contentMapper.insertContent(content);
    }

    /**
     * 根据主键id删除内容
     *
     * @param id
     */
    public void subContent(Long id) {
        contentMapper.deleteContent(id);
    }

    /**
     * 根据主键id修改内容
     *
     * @param
     * @return
     */
    public String replaceContent(Long id, Content content) {
        content.setId(id);
        Integer flag = contentMapper.updateContent(content);
        if (flag == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    /**
     * 查询所有内容
     *
     * @return
     */
    public List<Content> findAllContent() {
        return contentMapper.selectContent();
    }
}
