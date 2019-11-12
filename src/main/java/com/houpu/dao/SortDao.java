package com.houpu.dao;

import com.houpu.model.Sort;
import org.apache.ibatis.annotations.Param;

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
    /**
     * 查询下架的类别
     * @return
     */
    List<Sort> queryAllSortIs(@Param("is") Integer is);

    /*
    将类别下架
    * */
    void updateIs(Sort sort);

}
