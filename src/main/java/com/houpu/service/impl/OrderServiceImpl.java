package com.houpu.service.impl;

import com.houpu.dao.OrderDao;
import com.houpu.model.Order;
import com.houpu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    private OrderDao orderDao;

    @Override
    public List<Order> queryAll() {
        return orderDao.queryAll();
    }

    @Override
    public List<Map<String, Object>> queryAchievement() {
        return orderDao.queryAchievement();
    }


}
