package com.houpu.service.impl;

import com.houpu.dao.OrderDao;
import com.houpu.model.Order;
import com.houpu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    private OrderDao orderDao;

    @Override
    public List<Order> queryAll() {
        return orderDao.queryAll();
    }
}
