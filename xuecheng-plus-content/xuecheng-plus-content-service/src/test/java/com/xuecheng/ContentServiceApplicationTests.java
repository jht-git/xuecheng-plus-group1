package com.xuecheng;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Tjh
 * @version 1.0
 * @description TODO
 * @date 2023/2/6 21:04
 */
@SpringBootTest
public class ContentServiceApplicationTests {
    @Autowired
    CourseBaseMapper courseBaseMapper;
    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @Test
    void testCourseMapper() {
        CourseBase courseBase = courseBaseMapper.selectById(74L);
        Assertions.assertNotNull(courseBase);
    }
    @Test
    void testCourseBaseInfoService() {
        PageParams pages = new PageParams();
        System.out.println(courseBaseInfoService.queryCourseBaseList(pages, new QueryCourseParamsDto()));
    }
}
