package com.houpu.dao;

import com.houpu.model.Order;

import java.util.List;
import java.util.Map;

public interface OrderDao {

    /**
     * 查询所有订单
     * @return
     */
    List<Order> queryAll();

    /**
     * 查询各部门业绩(订单数量)
     * @return
     */
    List<Map<String, Object>> queryAchievement();
}
