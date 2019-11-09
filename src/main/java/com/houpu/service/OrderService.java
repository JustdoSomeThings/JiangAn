package com.houpu.service;

import com.houpu.model.Order;

import java.util.List;

public interface OrderService {

    /**
     * 查询所有订单
     * @return
     */
    List<Order> queryAll();
}
