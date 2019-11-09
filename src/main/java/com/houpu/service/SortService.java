package com.houpu.service;

import com.houpu.model.Sort;

import java.util.List;

public interface SortService {
    /**
     * 查询所有类别
     * @return
     */
    List<Sort> queryAllSort();

    /**
     * 新增类别
     * @return
     */
    int insertSort(Sort sort);
}
