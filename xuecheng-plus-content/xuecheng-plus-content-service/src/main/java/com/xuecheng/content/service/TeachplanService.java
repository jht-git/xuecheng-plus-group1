package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @author Tjh
 * @version 1.0
 * @description TODO
 * @date 2023/2/10 15:18
 */
public interface TeachplanService {
     List<TeachplanDto> findTeachplayTree(long courseId);

      void saveTeachplan(SaveTeachplanDto teachplanDto);

}
