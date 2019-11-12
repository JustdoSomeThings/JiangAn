package com.houpu.dao;


import com.houpu.model.Outproduct;

import java.util.List;

public interface OutproductDao {

    /**
     * 查询所有入库
     * @return
     */
    List<Outproduct> showAll();

}
