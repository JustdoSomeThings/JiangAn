package com.houpu.dao;

import com.houpu.model.Order;

import java.util.List;

public interface OrderDao {

    /**
     * 查询所有订单
     * @return
     */
    List<Order> queryAll();
}
