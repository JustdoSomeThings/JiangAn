package com.houpu.dao;


import com.houpu.model.Product;

import java.util.List;

public interface ProductDao {

    /**
     * 查询所有产品
     * @return
     */
    List<Product> queryAllProduct();

}
