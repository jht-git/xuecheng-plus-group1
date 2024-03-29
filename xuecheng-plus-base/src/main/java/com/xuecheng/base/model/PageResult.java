package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tjh
 * @version 1.0
 * @description TODO
 * @date 2023/2/6 15:29
 */
@Data
@ToString
public class PageResult<T> implements Serializable {
    // 数据列表
    private List<T> items;
    //总记录数
    private long counts;
    //当前页码
    private long page;
    //每页记录数
    private long pageSize;
    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }

}
