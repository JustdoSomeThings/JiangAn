package com.houpu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houpu.model.Order;
import com.houpu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    public Map<String, Object> queryAll(int page, int limit) {
        // 从第page页开始 每页查询limit数据
        PageHelper.startPage(page, limit);
        List<Order> orderList = orderService.queryAll();
        PageInfo<Order> pageInfo = new PageInfo<>(orderList, limit);
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", pageInfo.getList());
        result.put("count", pageInfo.getTotal());
        return result;
    }

    @RequestMapping(value = "/queryAchievement", method = RequestMethod.POST)
    public List<Map<String, Object>> queryAchievement() {
        List<Map<String, Object>> result = orderService.queryAchievement();
        for (Map<String, Object> stringObjectMap : result) {
            String key = null;
            Object value = null;
            for (Map.Entry<String, Object> field : stringObjectMap.entrySet()) {
                key = field.getKey();
                value = field.getValue();
                System.out.println(key + " : " + value);
            }
        }
        return result;
    }

}
