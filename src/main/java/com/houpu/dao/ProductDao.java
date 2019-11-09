package com.houpu.dao;


import com.houpu.model.Product;

import java.util.List;

public interface ProductDao {

    /**
     * 查询所有产品
     * @return
     */
    List<Product> queryAll();

    /**
     * 删除一个产品(更新客户状态, 可恢复)
     * @param id
     */
    void updateState(Integer id);

    /**
     * 更新一个产品信息
     * @param product
     */
    void update(Product product);

    /**
     * 新增一个产品
     * @param product
     */
    void saveProduct(Product product);
}
