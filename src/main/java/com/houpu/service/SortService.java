package com.houpu.service;

import com.houpu.model.Sort;

import java.util.List;
import java.util.Map;

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
    /**
     * 查询下架的类别
     * @return
     */
    List<Sort> queryAllSortIs(Integer is);
    /*
    * 下架
    * */
    void updateIs(Sort sort);
}
