package com.houpu.dao;

import com.houpu.model.Inproduct;

import java.util.List;

public interface InproductDao {

    /**
     * 查询所有库存
     * @return
     */
    List<Inproduct> queryAll();


}
