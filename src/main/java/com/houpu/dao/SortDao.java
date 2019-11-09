package com.houpu.dao;

import com.houpu.model.Employee;
import com.houpu.model.Sort;

import java.util.List;

public interface SortDao {
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
