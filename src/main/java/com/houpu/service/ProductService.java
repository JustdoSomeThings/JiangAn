package com.houpu.service;


import com.houpu.model.Product;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有产品
     * @return
     */
    List<Product> queryAllProduct();

}
