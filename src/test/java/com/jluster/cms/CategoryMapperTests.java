package com.jluster.cms;

import com.jluster.cms.mapper.CategoryMapper;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 类目表映射接口测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTests {

    @Resource
    private CategoryMapper categoryMapper;



    /**
     * 新增分类测试
     */
   /* @Test
    public void contextLoads() {
        Category category = new Category();
        //parentId,name,code,level,status,sort,created_by,modified_by
        category.setParentId(1L);
        category.setName("Java");
        category.setCode("222222222");
        category.setLevel(1L);
        category.setStatus("1");
        category.setSort("2");
        category.setCreated_by("创建人");
        category.setModified_by("更新人");
        categoryMapper.insertCategory(category);
    }*/


}
