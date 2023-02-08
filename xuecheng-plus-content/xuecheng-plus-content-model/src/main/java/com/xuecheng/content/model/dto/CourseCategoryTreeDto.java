package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author Tjh
 * @version 1.0
 * @description TODO
 * @date 2023/2/7 22:44
 */
@Data
@ToString
public class CourseCategoryTreeDto extends CourseCategory {
    List childrenTreeNodes;
}
